package com.barentine.api;

public class Application {
    public static void main(String [ ] args) {
        try {
            SparkServer server = new SparkServer();
            server.setupServer();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}