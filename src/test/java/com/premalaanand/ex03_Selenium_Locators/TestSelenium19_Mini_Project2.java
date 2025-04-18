package com.premalaanand.ex03_Selenium_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19_Mini_Project2 {

    @Owner("premalaA")
    @Severity(SeverityLevel.BLOCKER)

    @Description("Verify that the error message comes with invalid email on signup page")
    @Test

    public void vwo_free_trail_error_verify(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement a_partial_linktext_trial = driver.findElement(By.partialLinkText("trial"));
        a_partial_linktext_trial.click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        //id="page-v1-step1-email"
       // name="email"

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        //id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        //name="gdpr_consent_checkbox"

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

       List<WebElement>   buttonlist = driver.findElements(By.tagName("button"));
       buttonlist.get(0).click();

       //
        // class="C($color-red) Fz($font-size-12)
        // Trsp($Op) Trsdu(0.15s) Op(0)
        // invalid-input+Op(1) invalid-reason"
        //The email address you entered is incorrect.

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> error_msg = driver.findElements(By.className("invalid-reason"));
//        Assert.assertTrue(error_msg.isDisplayed());
        Assert.assertEquals(error_msg.get(0).getText(),"The email address you entered is incorrect.");

        driver.quit();
    }
}
