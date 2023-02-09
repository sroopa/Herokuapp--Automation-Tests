package com.Herokuapp.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;
    public static WebDriver InitialiseWebdriver()
    {
        driver = new ChromeDriver();
        return driver;
    }


}
