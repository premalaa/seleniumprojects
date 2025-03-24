package com.premalaanand.selenium02Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project1 {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments("--start - maximized---");

        WebDriver driver = new EdgeDriver(edgeOptions);

      //  driver.navigate().to("https://app.vwo.com");
        driver.get("https://app.vwo.com/#/login");

        // 1. Find the email inputbox and enter the email
        // 1. Find the email inputbox and enter the email
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // > close Tag

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

       // <input class="input-text W(100%)"
        // type="email"
        // name="email"
        // id="modal-contact-us-cu-email"
        // > close Tag

        //2.Find the password inputbox and enter the password
        // <input class="W(100%) Py(14px)
        // input-text atomic-password"
        // type="password" id="modal-v1-pwd"
        // name="password"
        // data-qa="modal-su-v1-pwd"

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        // 3. Find the submit button and click on it.
//<button type="submit"
// disabled class="button button--disabled-primary W(100%) btn-modal-form-submit"
// data-qa="modal-su-submit"
        // <button type="submit"
        // disabled="disabled"
        // class="button button--disabled W(100%)
        // js-ext-next" data-step="extended-demo-step6-form" data-qa="modal-req-demo-extended-rd-form-submit"

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();


        Thread.sleep(5000);



        // 4. Find the invalid error message and verify.
        // <div
        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>
//

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
       // errorMessage.sendKeys();

        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");


        driver.quit();
    }
}
