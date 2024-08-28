package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebFormPage {
    private WebDriver driver;

    private By inputField = By.id("my-text-id");
    private By submitButton = By.cssSelector("button");

    public WebFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    public String getResultText() {
        return driver.findElement(By.id("message")).getText();
    }
}
