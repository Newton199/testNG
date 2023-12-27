package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Handlinghard_Assert {
     public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech Academy";

        String actualPageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://chroma-tech-academy.mexil.it/static_page/something";

        WebElement actualInstructorJohnText = driver.findElement(By.xpath("(//*[contains(text(),'John')])[1]"));
        String expectedInstructorJohnText = "John";

         Assert.assertEquals(actualPageTitle, expectedPageTitle); 


         Assert.assertEquals(actualPageURL,expectedPageURL);

         try {
              Assert.assertEquals(actualPageURL,expectedPageURL);
            
         } catch (AssertionError e) {

            e.printStackTrace();

         }

         Assert.assertEquals(actualInstructorJohnText.getText(), expectedInstructorJohnText);

          driver.quit();



        
    
}
}
