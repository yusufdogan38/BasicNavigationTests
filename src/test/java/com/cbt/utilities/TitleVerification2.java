package com.cbt.utilities;


import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com" ,"https://www.westelm.com/" );



        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String titleOne = driver.getTitle();
        titleOne = titleOne.toLowerCase();// case insensitive
        titleOne = titleOne.replace(" ", "");// space insensitive
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        if(urls.get(0).contains(titleOne)){
            System.out.println("WEBSITE ONE PASSED");
        }else {
            System.out.println("WEBSITE ONE FAILED");
        }
        driver.navigate().to(urls.get(1));
        String titleTwo = driver.getTitle();
        titleTwo = titleTwo.toLowerCase();
        titleTwo = titleTwo.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        if(urls.get(1).contains(driver.getTitle())){
            System.out.println("WEBSITE TWO PASSED");
        }else {
            System.out.println("WEBSITE TWO FAILED");
        }

        driver.navigate().to(urls.get(2));
        String titleThree = driver.getTitle();
        titleThree = titleThree.toLowerCase();
        titleThree = titleThree.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        if(urls.get(2).contains(driver.getTitle())){
            System.out.println("WEBSITE THREE PASSED");
        }else {
            System.out.println("WEBSITE THREE FAILED");
        }
        driver.navigate().to(urls.get(3));
        String titleFour = driver.getTitle();
        titleFour = titleFour.toLowerCase();
        titleFour = titleFour.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        if(urls.get(3).contains(driver.getTitle())){
            System.out.println("WEBSITE FOUR PASSED");
        }else {
            System.out.println("WEBSITE FOUR FAILED");
        }

        driver.close();
    }
}