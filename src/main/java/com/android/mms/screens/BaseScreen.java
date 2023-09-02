package com.android.mms.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.time.Duration;

public class BaseScreen {
    private AndroidDriver driver;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public By byId(String id){
        return By.id(id);
    }

    public By byClassName(String className){
        return By.className(className);
    }

    public boolean isDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public void implicitlyWait(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
}
