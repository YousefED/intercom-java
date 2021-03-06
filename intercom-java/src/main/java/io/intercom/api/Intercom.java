package io.intercom.api;

import java.net.URI;

public class Intercom {

    private static final URI API_BASE_URI = URI.create("https://api.intercom.io/");

    private static volatile URI apiBaseURI = API_BASE_URI;

    private static final String AUTH_SCHEME = getAuthBasic();

    static final String AUTH_BASIC = "Basic";

    static final String AUTH_BEARER = "Bearer";

    public static final String VERSION = "0.0.1";

    public static final String USER_AGENT = "intercom-java/" + Intercom.VERSION;

    private static volatile String apiKey;

    private static volatile String appID;

    private static volatile int connectionTimeout = 3 * 1000;

    private static volatile int requestTimeout = 60 * 1000;

    private static volatile boolean requestUsingCaches = false;

    private static volatile HttpConnectorSupplier httpConnectorSupplier = HttpConnectorSupplier.defaultSupplier;

    public static int getConnectionTimeout() {
        return connectionTimeout;
    }

    public static void setConnectionTimeout(int connectionTimeout) {
        Intercom.connectionTimeout = connectionTimeout;
    }

    public static int getRequestTimeout() {
        return requestTimeout;
    }

    public static void setRequestTimeout(int requestTimeout) {
        Intercom.requestTimeout = requestTimeout;
    }

    public static boolean isRequestUsingCaches() {
        return requestUsingCaches;
    }

    public static void setRequestUsingCaches(boolean requestUsingCaches) {
        Intercom.requestUsingCaches = requestUsingCaches;
    }

    public static HttpConnectorSupplier getHttpConnectorSupplier() {
        return httpConnectorSupplier;
    }

    public static void setHttpConnectorSupplier(HttpConnectorSupplier supplier) {
        Intercom.httpConnectorSupplier = supplier;
    }

    public static String getAppID() {
        return appID;
    }

    public static void setAppID(String appID) {
        Intercom.appID = appID;
    }

    public static String getApiKey() {
        return Intercom.apiKey;
    }

    public static void setApiKey(String apiKey) {
        Intercom.apiKey = apiKey;
    }

    public static URI getApiBaseURI() {
        return Intercom.apiBaseURI;
    }

    public static void setApiBaseURI(URI apiBaseURI) {
        Intercom.apiBaseURI = apiBaseURI;
    }

    static String getAuthBasic() {
        return AUTH_BASIC;
    }

    static String getAuthScheme() {
        return AUTH_SCHEME;
    }

    static String getAuthBearer() {
        return AUTH_BEARER;
    }
}
