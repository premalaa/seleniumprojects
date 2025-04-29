package com.premalaanand.ex15_Relative_locators;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab43_RL_P3_REAL_EXAMPLE extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();
        //js.executeScript("window.scrollBy(0, 500);");

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchBox.sendKeys("india" + Keys.ENTER);

        //WaitHelpers.waitJVM(5000);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement location : locations) {

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();
            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | ");


        }


    }
}