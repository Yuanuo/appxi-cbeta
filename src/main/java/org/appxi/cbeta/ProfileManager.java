package org.appxi.cbeta;

import org.appxi.prefs.Preferences;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfileManager {
    public final Bookcase bookcase;
    public final Path workspace;
    public final Preferences config;

    private final List<Profile> profiles = new ArrayList<>();

    private String defaultProfileId;

    public ProfileManager(Bookcase bookcase, Path workspace, Preferences config) {
        this.bookcase = bookcase;
        this.workspace = workspace;
        this.config = config;
    }

    public String getDefaultProfileId() {
        if (this.profiles.isEmpty()) {
            getProfiles();
        }
        return defaultProfileId;
    }

    public List<Profile> getProfiles() {
        if (!profiles.isEmpty()) {
            return profiles;
        }
        //
        try (InputStream stream = bookcase.getContentAsStream("menu_nav.xhtml")) {
            final Document doc = Jsoup.parse(stream, StandardCharsets.UTF_8.name(), "/", Parser.xmlParser());
            final Element nav = doc.body().selectFirst("nav");
            if (null != nav) {
                final String version = bookcase.getVersion();
                for (Element navlink : nav.select(":root > navlink, :root > li > navlink")) {
                    final String filename = navlink.attr("href");
                    final String id = filename.substring(0, filename.length() - 10); // 10 for "_nav.xhtml"
                    final String repo = ".profile." + id;
                    profiles.add(new Profile.InternalProfile(id, navlink.text(), "", version, workspace.resolve(repo), filename));
                }
                //
                defaultProfileId = nav.attr("default");
                if (!profiles.isEmpty() && null == getProfile(defaultProfileId)) {
                    defaultProfileId = "bulei";
                    if (null == getProfile(defaultProfileId)) {
                        defaultProfileId = profiles.get(0).id();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //
        for (int i = 1; i < 21; i++) {
            profiles.add(new Profile.ExternalProfile(workspace.resolve(".profile" + i), "我的书单" + i + "：未定义"));
        }
        //
        return Collections.unmodifiableList(profiles);
    }

    public Profile getProfile(String id) {
        return getProfiles().stream().filter(p -> p.id().equals(id)).findFirst().orElse(null);
    }
}
