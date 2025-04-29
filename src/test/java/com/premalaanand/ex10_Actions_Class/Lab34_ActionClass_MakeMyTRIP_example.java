package com.premalaanand.ex10_Actions_Class;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static com.premalaanand.ex07_WaitHelper.WaitHelper.waitJVM;

public class Lab34_ActionClass_MakeMyTRIP_example extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p4(){

        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        // Wait for the popup to come and click the x icon
//data-cy="closeModal"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));


        //WaitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"));

        // this will clos the modal
        WebElement modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));

        modal.click();

        // do ctrlF and type #fromCity , id="fromCity"

        WebElement fromCity = driver.findElement(By.id("fromCity"));
        waitJVM(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();
        waitJVM(3000);
        //id="react-autowhatever-1-section-0-item-1"
        List<WebElement> list_autocomplete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        for (WebElement e: list_autocomplete){

            if(e.getText().contains("Chandigarh")){
                e.click();
            }
        }
    }
}
