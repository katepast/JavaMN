package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebFormTest extends BaseTest {

    @Test
    public void testSubmitWebForm() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebFormPage webFormPage = new WebFormPage(driver);
        webFormPage.enterText("Test message");
        webFormPage.submitForm();

        String result = webFormPage.getResultText();
        Assert.assertEquals(result, "Received!", "The form was not submitted correctly.");
    }
}

