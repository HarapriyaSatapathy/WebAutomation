package com.project.pages.base;

import com.project.pages.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Basepage {

    public Basepage() {}

        public void clickElement (By by){
            DriverManager.driver.findElement(by).click();
        }

        public void enterInput (By by, String key){
            DriverManager.driver.findElement(by).sendKeys(key);
        }

        public WebElement getElement (By key){
            DriverManager.driver.findElement(key);
            return null;
        }

        public WebElement presenceofElement (By elementlocation){
            return new WebDriverWait(DriverManager.driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementlocation));
        }
        public WebElement visibilityofElement (By elementlocation){
            return new WebDriverWait(DriverManager.driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementlocation));
        }
    }

