package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium08 {
    @Description("open the title")
    @Test
    public void test_selenium07() {
        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();


        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

        driver.quit();


    }
}