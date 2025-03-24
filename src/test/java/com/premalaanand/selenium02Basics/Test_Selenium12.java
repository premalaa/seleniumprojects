package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium12 {
    @Description("Open the url")
    @Test
    public void test_selenium12() throws Exception{

        WebDriver driver =new EdgeDriver();

        driver.get("https://google.com/");

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL

        // Use navigation methods

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        Thread.sleep(5000);

        driver.quit();
    }
}
