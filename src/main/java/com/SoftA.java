package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class SoftA {
    public static void main(String[] args){
    ChromeOptions options = new ChromeOptions();
    options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
    options.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    String url = "https://chroma-tech-academy.mexil.it/static_page/";
    driver.get(url);
// Changing  the  name of string to check  actual and expected variables
    String actualPageTitle =driver.getTitle();
    String expectedPageTitle ="Chroma Tech School";

    String actualPageURL = driver.getCurrentUrl();
    String expectedPageURL = "https://chroma-tech-academy.mexil.it/static_page/something";

    WebElement actualInstructorJohnText =driver.findElement(By.xpath("(//*[contains(text(),'John')])[1]"));
    String expectedInstructorJohnText ="John";

    //Step1  Create an object/Instance  of the soft assert  class

    SoftAssert softAssert =new SoftAssert();

    //step2: perform assertion

    //Verifying  page title

    softAssert.assertEquals(actualPageTitle,expectedPageTitle);
// verifying url
    softAssert.assertEquals(actualPageURL, expectedPageURL);
//verifying instructor
    softAssert.assertEquals(actualInstructorJohnText.getText(), expectedInstructorJohnText);
    softAssert.assertTrue(actualInstructorJohnText.getText().contains("something"), "verifying john text using");

    softAssert.assertAll();
    

    driver.quit();








    }
}
