package org.appxi.cbeta;

import org.appxi.prefs.PreferencesInProperties;

import java.nio.file.Path;

public sealed interface Profile permits Profile.InternalProfile, Profile.ExternalProfile {

    String id();

    String title();

    String description();

    String filename();

    String version();

    Path workspace();

    String template();

    default boolean isManaged() {
        return this instanceof ExternalProfile;
    }

    record InternalProfile(String id, String title, String description, String version, Path workspace,
                           String filename) implements Profile {
        public String toString() {
            return this.title();
        }

        @Override
        public String template() {
            return id;
        }
    }

    final class ExternalProfile implements Profile {
        final Path workspace;
        public final PreferencesInProperties config;

        ExternalProfile(Path workspace) {
            this.workspace = workspace;
            this.config = new PreferencesInProperties(workspace.resolve(".info"));
        }

        ExternalProfile(Path workspace, String name) {
            this(workspace);
            this.config.setProperty("name", name);
        }

        @Override
        public Path workspace() {
            return workspace;
        }

        @Override
        public String id() {
            return workspace.getFileName().toString().substring(1);
        }

        @Override
        public String title() {
            return config.getString("name", "");
        }

        @Override
        public String description() {
            return config.getString("desc", "");
        }

        @Override
        public String filename() {
            return ".profile";
        }

        @Override
        public String version() {
            return config.getString("version", "");
        }

        @Override
        public String template() {
            return config.getString("based", "");
        }

        public String toString() {
            return this.title();
        }
    }
}
