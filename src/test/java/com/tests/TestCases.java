package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCases {

    public WebDriver driver;

    @BeforeMethod
    public void launch(){
        System.setProperty("webdriver.chrome.driver","E:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
    @Test
    public void testCaseOne(){
        driver.navigate().to("https://www.google.com");
    }
    @Test
    public void testCaseTwo(){
        driver.navigate().to("https://www.linkedin.com");
    }
    @Test
    public void testCaseThree(){
        driver.navigate().to("https://www.hotmail.com");
    }
    @AfterMethod
    public void tearDown(){
        // Quit the browser
        if (driver != null) {
            driver.quit();
        }
    }


}
