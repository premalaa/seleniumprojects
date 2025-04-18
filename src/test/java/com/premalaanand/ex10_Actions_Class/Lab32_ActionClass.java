package com.premalaanand.ex10_Actions_Class;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab32_ActionClass extends TestCaseBoilerPlate {


    EdgeDriver driver;

    @Test
    public void test_action(){
        //System.out.println("hi");
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();


    }

}
