package com.premalaanand.ex12_Windows;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Windows_Part1 extends TestCaseBoilerPlate {
    @Test
    public void test_windows_p5() {


        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent); // 5E3E4218F83797AE6CB61D5209344159

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles);
//Window Handles: [5E3E4218F83797AE6CB61D5209344159, 9D0D17DC6A353367DFC9DABEAC6F3C53]


        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
            driver.switchTo().window(parent);
        }
    }




}
