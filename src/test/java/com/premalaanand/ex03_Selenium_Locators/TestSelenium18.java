package com.premalaanand.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18 {

    @Description("Verify vwo")
    @Test
    public void Test_login_vwo() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("----start maximize----");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // <a
        //        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        //        // class="text-link"
        //        // data-qa="bericafeqo">
        //        // Start a free trial
        //        //
        //        //</a>


//        // Link Text - Full Text Match
//        WebElement a_free_trial_start = driver.findElement(By.linkText("Start a free trial"));
//        a_free_trial_start.click();

        WebElement partial_link_text = driver.findElement(By.partialLinkText("trial"));
        partial_link_text.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
    }

