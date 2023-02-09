package com.Herokuapp.utils;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase
{
    public WebDriver getDriver() {
        return driver;
    }

    private WebDriver driver;
    @BeforeClass
    public void startWebDriver()
    {
        driver = DriverFactory.InitialiseWebdriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
