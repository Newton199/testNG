package com;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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


    
    }
}
