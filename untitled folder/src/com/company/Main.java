package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sisense/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

    Thread.sleep(250);

        driver.close();
        driver.quit();
    }
}
