package services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseService {

    public static final ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
    public static final ThreadLocal<String> TIME_ENTRY_ID = new ThreadLocal<>();

}
