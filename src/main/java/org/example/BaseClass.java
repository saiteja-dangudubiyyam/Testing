package org.example;

import org.openqa.selenium.WebDriver;
public class BaseClass {
    protected WebDriver driver;
    public void setDriver(String browserName) {
        driver = driverFactory.getDriver(browserName);
    }



}