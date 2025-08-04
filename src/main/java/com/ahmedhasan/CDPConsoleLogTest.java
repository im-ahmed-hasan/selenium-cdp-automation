package com.ahmedhasan;

/*
 * Author: Ahmed Hasan
 * © Ahmed Hasan 2025. All rights reserved.
 *
 * This example demonstrates how to use Chrome DevTools Protocol (CDP)
 * with Selenium 4.34.0 to capture JavaScript console logs in Chrome.
 */

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v138.log.Log;

public class CDPConsoleLogTest {

    public static void main(String[] args) {

        // Start Chrome browser (Selenium Manager will auto-resolve driver)
        ChromeDriver driver = new ChromeDriver();

        // Create a DevTools session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // Enable browser log capture
        devTools.send(Log.enable());

        // Add listener for log events
        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("\n==================== CDP Console Log ====================");
            System.out.printf(" 🔔 Level   : %-10s%n", logEntry.getLevel());
            System.out.printf(" 📝 Message : %s%n", logEntry.getText());
            System.out.printf(" 🌐 URL     : %s%n", logEntry.getUrl().orElse("N/A"));
            System.out.println("=========================================================");
            System.out.println(" © Ahmed Hasan · v2025");
        });

        // Load test page
        driver.get("https://example.com");

        // Wait briefly to capture the event
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
