package com.it.netty.server;

public class Constants {

    private static String clientId;
    public static String getClientId() {
        return clientId;
    }
    public static void setClientId(String clientId) {
        Constants.clientId = clientId;
    }
}
