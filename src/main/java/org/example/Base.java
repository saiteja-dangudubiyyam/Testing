package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Base {
    public static WebDriver driver;
    public static WebDriver getDriver() throws IOException {
        FileInputStream fis= new FileInputStream("C:/Users/Saiteja_Dangudubiyya/IdeaProjects/Testing/data.properties");
        Properties prop= new Properties();
        prop.load(fis);
        String browser=prop.getProperty("browser");


        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    "C:/Users/Saiteja_Dangudubiyya/Downloads/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",
                    "C:/Users/Saiteja_Dangudubiyya/Downloads/IEDriverServer_Win32_3.150.2/IEDriverServer.exe");
            driver = new InternetExplorerDriver();}

        driver.manage().window().maximize();
        driver.get("https:/www.google.com/");
        return driver;
    }}