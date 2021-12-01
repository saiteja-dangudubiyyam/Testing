package org.example.Test;

import org.example.BaseClass;
import org.example.consumer.LoginConsumer;
import org.example.consumer.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.function.Consumer;


public class AppTest extends BaseClass {
    @BeforeTest
    public void test() {
        setDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");


    }

//    @Test(dataProvider = "consumerConditions")
//    public void g(Consumer<LoginPage> con) throws InterruptedException {
//        driver.get("https://www.hackerrank.com/auth/signup");
//        Thread.sleep(500);
//        LoginPage loginPage = new LoginPage(driver);
//        con.accept(loginPage);
//
//    }
//
    @Test(dataProvider = "conditions")
    public void linkloginData(Consumer<LoginPage> con) {
        driver.get("https://www.hackerrank.com/auth/signup");
        LoginPage login = new LoginPage(driver);
        con.accept(login);
    }


    @org.testng.annotations.DataProvider
    public Object[][] conditions()
    {
        return new Object[][]{{LoginConsumer.INVALID},{LoginConsumer.SUCCESS}};
    }
}