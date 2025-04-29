package com.premalaanand.ex10_Actions_Class;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab35_ActionClass_P4 extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p5() {


        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();



















    }


}
