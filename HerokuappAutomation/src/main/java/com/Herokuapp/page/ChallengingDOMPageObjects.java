package com.Herokuapp.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class ChallengingDOMPageObjects extends PageBase {
    private WebDriver driver;

    String foo = "foo";
    String bar = "bar";
    String qux = "qux";
    String baz = "baz";

    String baseUrl = "https://the-internet.herokuapp.com/challenging_dom";
    String table = "//div[@class='large-10 columns']";
    String firstButton = "//a[@class='button']";
    String secondButton = "//a[@class='button alert']";
    String thirdButton = "//a[@class='button success']";

    String edit = "//a[contains(@href,'#edit')]";
    String delete = "//a[contains(@href,'#delete')]";


    public ChallengingDOMPageObjects(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isTableDisplayed() {
        return driver.findElement(By.xpath(table)).isDisplayed();
    }
    public boolean isTableNotDisplayed() {
        return driver.findElement(By.xpath(table)).isDisplayed();
    }
    public void triggerFirstButtonAndCheckLabels() {
        String valueOfFirstButton = driver.findElement(By.xpath(firstButton)).getText();
        String valueOfSecondButton = driver.findElement(By.xpath(secondButton)).getText();
        String valueOfThirdButton = driver.findElement(By.xpath(thirdButton)).getText();

        String[] buttonCombination = {valueOfFirstButton, valueOfSecondButton, valueOfThirdButton};

        driver.findElement(By.xpath(firstButton)).click();

        String valueOfFirstButton1 = driver.findElement(By.xpath(firstButton)).getText();
        String valueOfSecondButton1 = driver.findElement(By.xpath(secondButton)).getText();
        String valueOfThirdButton1 = driver.findElement(By.xpath(thirdButton)).getText();
        String[] buttonCombination1 = {valueOfFirstButton1, valueOfSecondButton1, valueOfThirdButton1};
        System.out.println(valueOfFirstButton + " " + valueOfSecondButton + " " + valueOfThirdButton);
        System.out.println(valueOfFirstButton1 + " " + valueOfSecondButton1 + " " + valueOfThirdButton1);
        Assert.assertFalse(Arrays.equals(buttonCombination, buttonCombination1));
    }
    public void triggerSecondButtonAndCheckLabels() {
        String valueOfFirstButton = driver.findElement(By.xpath(firstButton)).getText();
        String valueOfSecondButton = driver.findElement(By.xpath(secondButton)).getText();
        String valueOfThirdButton = driver.findElement(By.xpath(thirdButton)).getText();

        String[] buttonCombination = {valueOfFirstButton, valueOfSecondButton, valueOfThirdButton};

        driver.findElement(By.xpath(secondButton)).click();

        String valueOfFirstButton1 = driver.findElement(By.xpath(firstButton)).getText();
        String valueOfSecondButton1 = driver.findElement(By.xpath(secondButton)).getText();
        String valueOfThirdButton1 = driver.findElement(By.xpath(thirdButton)).getText();
        String[] buttonCombination1 = {valueOfFirstButton1, valueOfSecondButton1, valueOfThirdButton1};
        System.out.println(valueOfFirstButton + " " + valueOfSecondButton + " " + valueOfThirdButton);
        System.out.println(valueOfFirstButton1 + " " + valueOfSecondButton1 + " " + valueOfThirdButton1);
        Assert.assertFalse(Arrays.equals(buttonCombination, buttonCombination1));
    }

    public void triggerThirdButtonAndCheckLabels() {
        String valueOfFirstButton = driver.findElement(By.xpath(firstButton)).getText();
        String valueOfSecondButton = driver.findElement(By.xpath(secondButton)).getText();
        String valueOfThirdButton = driver.findElement(By.xpath(thirdButton)).getText();

        String[] buttonCombination = {valueOfFirstButton, valueOfSecondButton, valueOfThirdButton};

        driver.findElement(By.xpath(thirdButton)).click();

        String valueOfFirstButton1 = driver.findElement(By.xpath(firstButton)).getText();
        String valueOfSecondButton1 = driver.findElement(By.xpath(secondButton)).getText();
        String valueOfThirdButton1 = driver.findElement(By.xpath(thirdButton)).getText();
        String[] buttonCombination1 = {valueOfFirstButton1, valueOfSecondButton1, valueOfThirdButton1};
        System.out.println(valueOfFirstButton + " " + valueOfSecondButton + " " + valueOfThirdButton);
        System.out.println(valueOfFirstButton1 + " " + valueOfSecondButton1 + " " + valueOfThirdButton1);
        Assert.assertFalse(Arrays.equals(buttonCombination, buttonCombination1));
    }
    public void triggerAnyEditButtonAndGetTheCurrentUrl() {
        driver.findElement(By.xpath(edit)).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertNotEquals(baseUrl, currentUrl);
    }

    public void searchAndEditARow() {
        String value = "Adipisci9";
        driver.findElement(By.xpath("//td[contains(.," + value + ")]/parent::*//a[contains(@href,'#edit')]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl, currentUrl);
    }
    public void triggerAnyDeleteButtonAndGetTheCurrentUrl() {
        driver.findElement(By.xpath(edit)).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertNotEquals(baseUrl, currentUrl);
    }
    public void searchAndDeleteRow() {
        String value = "Adipisci9";
        driver.findElement(By.xpath("//td[contains(.," + value + ")]/parent::*//a[contains(@href,'#delete')]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl, currentUrl);
    }
    public void clickForkMeOnGitHub()
    {
        driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(baseUrl, currentUrl);
    }
}
