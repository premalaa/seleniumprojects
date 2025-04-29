package com.premalaanand.ex10_Actions_Class;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab32_ActionClass extends TestCaseBoilerPlate {




    @Test
    public void test_action(){
        //System.out.println("hi");
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();


        // KEYS -ACTION CLASSES

        WebElement firstname = driver.findElement(By.name("firstname"));


        //Action actions = new Action(driver)
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform();


    }

}
