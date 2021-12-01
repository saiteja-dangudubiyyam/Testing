//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.function.Predicate;
//
//
//public class PredicateEx extends Baseclass {
//    WebDriver driver;
//
//
//    public void displayElements(List<WebElement> list, Predicate<WebElement> Conditon){
//        list.stream().filter(Conditon).forEach(s-> System.out.println(s));
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        PredicateEx a =new PredicateEx();
//      a.setDriver("chrome");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com/intl/en-GB/gmail/about/");
////        driver.findElements(By.xpath("//a")).stream()
////                .map(x->x.getText())
////                .distinct()
////                .sorted()
////                .filter(s->s.startsWith("I")||s.contains("G")||s.isBlank())
////                .forEach(s->System.out.println(s));
//
//
//    }
//
//
//
//
//
//
//
//        }
//
//
//
//
