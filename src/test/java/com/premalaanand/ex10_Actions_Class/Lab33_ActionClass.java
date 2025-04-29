package com.premalaanand.ex10_Actions_Class;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab33_ActionClass extends TestCaseBoilerPlate {

    @Test
    public  void test_actions(){

        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input"));


        Actions actions = new Actions(driver);

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }
}
