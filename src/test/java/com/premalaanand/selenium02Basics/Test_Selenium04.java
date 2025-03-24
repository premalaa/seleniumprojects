package com.premalaanand.selenium02Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Selenium04 {







    // SearchContext - Interface - findElement, and findElements - GGF
    // WebDriver - Interface - some incomplete functions - GF
    // RemoteWebDriver - Class- It also has some functions - F
    // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S






//    SearchContext driver = new FirefoxDriver();
//    SearchContext driver1 = new ChromeDriver();
//
//    SearchContext driver2 = new EdgeDriver();
//
//    SearchContext driver3 = new InternetExplorerDriver();


    // Scenarios

    // 1. Do want to run on  Chrome or Edge?
//        ChromeDriver driver = new ChromeDriver();


    // 2  Do you want to run on Chrome then change to Edge ?
    WebDriver driver = new ChromeDriver();
//    driver = new EdgeDriver(); // 97% -
//    driver = new FirefoxDriver(); // 97% -


    // 3. do you want to run on multiple browsers, aws machine, ? 2%
    // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)



}
