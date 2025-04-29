package com.premalaanand.ex11_File_Upload;

import com.premalaanand.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v131.filesystem.model.File;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class Lab37_FileUpload extends TestCaseBoilerPlate {
    @Test
    public void test_fileUpload_p5(){

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);
        // /Users/promode/IdeaProjects/LearningSeleniumATB10x



        uploadFileInput.sendKeys(working_dir+"src/test/java/com/premalaanand/ex11_File_Upload/TestData.txt");
        driver.findElement(By.name("submit")).click();




        // Optional: Check if file exists before uploading
       }

    }

