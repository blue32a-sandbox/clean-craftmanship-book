package videoStore;

import java.util.HashMap;
import java.util.Map;

public class VideoRegistry {
    public enum VideoType {REGULAR, CHILDRENS};

    private static Map<String, VideoType> videoRegistry = new HashMap<>();

    public static Movie getMovie(String title) {
        switch (videoRegistry.get(title)) {
            case REGULAR:
                return new RegularMovie(title);
            case CHILDRENS:
                return new ChildrensMovie(title);
        }
        return null;
    }

    public static void addMovie(String title, VideoType type) {
        videoRegistry.put(title, type);
    }
}
