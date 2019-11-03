package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String titleOne = driver.getTitle();
        Thread.sleep(3000);//wait for 3 seconds
        driver.navigate().to(urls.get(1));
        String titleTwo = driver.getTitle();
        //StringUtility.verifyEquals(titleOne, titleTwo); // Passed
        Thread.sleep(3000);//wait for 3 seconds
        driver.navigate().to(urls.get(2));
        String titleThree= driver.getTitle();
        //StringUtility.verifyEquals(titleOne, titleThree);//Passed
        if(titleOne.equals(titleTwo) && titleOne.equals(titleThree)){
            System.out.println("ALL TITLES ARE SAME. PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        driver.close();
    }
}
