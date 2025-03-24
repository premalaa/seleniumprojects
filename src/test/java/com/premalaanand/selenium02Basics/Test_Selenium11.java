package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Selenium11 {
    @Description("Open th eURL")
    @Test
    public  void selenium11(){

        ChromeDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();

    }
}
