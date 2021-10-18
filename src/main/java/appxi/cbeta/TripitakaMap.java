package appxi.cbeta;

import org.appxi.util.FileHelper;
import org.appxi.util.NumberHelper;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class TripitakaMap {
    public final Bookcase bookcase;
    private Map<String, Tripitaka> data;

    public TripitakaMap(Bookcase bookcase) {
        this.bookcase = bookcase;
    }

    public Map<String, Tripitaka> data() {
        if (null != this.data)
            return this.data;

        this.data = new HashMap<>(32);
        try (InputStream stream = bookcase.getContentAsStream("bookdata.txt")) {
            FileHelper.lines(stream, Charset.forName("X-UTF-16LE-BOM"), this::parse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.data;
    }

    private void parse(String line) {
        final String[] arr = line.strip().split(",", 5);
        Tripitaka tripitaka = new Tripitaka(arr[0],
                arr.length < 2 ? 0 : NumberHelper.toInt(arr[1], 0),
                arr.length < 3 ? "ERR" : arr[2],
                arr.length < 4 ? "ERR" : arr[3],
                arr.length < 5 ? "ERR" : arr[4]);
        data.put(tripitaka.id, tripitaka);
    }
}
