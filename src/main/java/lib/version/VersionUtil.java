package lib.version;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VersionUtil {
    private static final String VERSION_PROPERTIES = "version.properties";
    private static String version;

    static {
        loadVersion();
    }

    private static void loadVersion() {
        Properties props = new Properties();
        try (InputStream is = VersionUtil.class.getClassLoader().getResourceAsStream(VERSION_PROPERTIES)) {
            if (is != null) {
                props.load(is);
                version = props.getProperty("version", "unknown");
            } else {
                version = "unknown";
            }
        } catch (IOException e) {
            version = "error: " + e.getMessage();
        }
    }

    public static String getVersion() {
        return version;
    }
}
