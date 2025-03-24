package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Test_Selenium09 {

    @Description("Open url")
    @Test
    public void test_selenium09(){

        WebDriver driver =new EdgeDriver();

        driver.get("https://www.google.com/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //Assert validations
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull()
                .isEqualTo("https://www.google.com/");


        driver.quit();
    }
}
