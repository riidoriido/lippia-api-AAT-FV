package services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<>();

    public static String setApiKey() throws IOException {

        Properties properties = new Properties();
        InputStream input;

        input = BaseService.class.getClassLoader().getResourceAsStream("config.properties");

        properties.load(input);

        return properties.getProperty("clockify.x-api-key");
    }
}
