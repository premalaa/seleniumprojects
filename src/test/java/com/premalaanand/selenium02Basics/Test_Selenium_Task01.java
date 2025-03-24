package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_Task01 {

    @Description("Verify that with  email, pass,  shown on the cura.com")
    @Test
    public void test_login() throws Exception {
        EdgeOptions edgeOptions1 = new EdgeOptions();

        //edgeOptions1.addArguments("--start_maximized---");

        WebDriver driver = new EdgeDriver(edgeOptions1);

        // driver.navigate().to("https://app.vwo.com");
        driver.get(" https://katalon-demo-cura.herokuapp.com/");


        //<input type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">
        WebElement makeAppointmentBtn = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();

        WebElement usernameField = driver.findElement(By.id("txt-username"));
        usernameField.sendKeys("John Doe");


        WebElement passwordField = driver.findElement(By.id("txt-password"));
        passwordField.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();


        Thread.sleep(5000);


        String expectedURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL, "URL did not change as expected!");
        System.out.println("Test Passed: URL changed to " + actualURL);

        driver.quit();
    }
}
