package org.example.selenium.cucumber.utils;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class StaticWait {

    private StaticWait() {
    }

    public static void waitForSeconds(int seconds) {

        Logger logger = Logger.getLogger(StaticWait.class.getName());

        try {
            Thread.sleep(seconds * 1_000L);

        } catch (InterruptedException e) {
            e.printStackTrace();
            LogRecord logRecord = new LogRecord(Level.INFO, "Interrupted!" + e.getMessage());
            logger.log(logRecord);
            Thread.currentThread().interrupt();
        }
    }
}
