package org.example.predicate;

import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Predicate;

public class P extends BaseClass {
    private static final Predicate<WebElement> STARTSWITH= s->s.getText().startsWith("G");
    private static final Predicate<WebElement> CONTAINS=x->x.getText().contains("I");
    private static final Predicate<WebElement> BLANK=y->y.getText().trim().length()== 0;


    @BeforeTest
    public void test() {
        setDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");

    }
    @Test(dataProvider="getData")
    public void test2(Predicate<WebElement> element) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.stream().filter(element).forEach(s->System.out.println(s.getAttribute("href")));

    }
    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {STARTSWITH},{CONTAINS},{BLANK}
        };
    }
    @Test
    private void test3() throws InterruptedException {
        Thread.sleep(5000);

        driver.quit();

    }}
