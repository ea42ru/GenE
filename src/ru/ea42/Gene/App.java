package ru.ea42.Gene;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    private static App instace;

    public static synchronized App getInstance() {
        if (instace == null) {
            instace = new App();
        }
        return instace;
    }

    public static synchronized void start() {
        App.log("started");
    }

    private static void log(String msg) {
        System.out.println(new SimpleDateFormat("dd.MM.yy HH:mm:ss:SSS").format(new Date()) + " - " + msg);
    }
}
