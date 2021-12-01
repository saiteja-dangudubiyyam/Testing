//package org.example;
//
//import com.google.common.base.Predicate;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class PredicateExample extends Baseclass{
//
//    private static final Predicate<WebElement> STARTSWITH= s->s.getText().startsWith("G");
//    private static final Predicate<WebElement> CONTAINS= x->x.getText().contains("I");
//    private static final Predicate<WebElement> BLANK= y->y.getText().trim().length()== 0;
//
//
//    @Test
//    public void test() {
//        setDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
//    }
//
//    @Test
//    public void test2() {
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        links.stream().filter(element).forEach(s->System.out.println(s.getAttribute("href")));
//
//    }
//    @DataProvider(name = "getData")
//    public Object[][] getData() {
//        return (Object[][]) new Object[] {
//                STARTSWITH,CONTAINS,BLANK
//        };
//    }
//    @Test
//    private void test3() throws InterruptedException {
//        Thread.sleep(3000);
//
//        driver.quit();
//
//    }
//}
