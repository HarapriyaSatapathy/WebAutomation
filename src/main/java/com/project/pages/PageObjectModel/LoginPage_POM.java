package com.project.pages.PageObjectModel;


import com.project.pages.base.Basepage;
import com.project.pages.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage_POM extends Basepage {


    public LoginPage_POM() {
        super();//it will call the basepage
    }

    //Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");

    By errormsg = By.id("js-notification-box-msg");

    //Page Actions

    public String VWOInvalidCreds() {
        enterInput(username,"admin");
        enterInput(password,"admin");
        clickElement(signButton);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getElement(errormsg).getText();
    }
}

