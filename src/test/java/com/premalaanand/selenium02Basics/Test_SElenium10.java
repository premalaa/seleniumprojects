package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_SElenium10 {

    @Description("Open the URL")
    @Test
    public  void test_selenium10() throws Exception{

        WebDriver driver = new EdgeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().minimize();

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is Visible");
            Assert.assertTrue(true);
        }
else {
    Assert.assertTrue(false);
    throw new Exception("CURA Healthcare Service is not Visible");
        }
        Thread.sleep(5000);

driver.quit();
    }
}
