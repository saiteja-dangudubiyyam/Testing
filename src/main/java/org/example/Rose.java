//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Supplier;
//
//
//    public class Rose<Flower> {
//
//        private static final Supplier<Flower> {
//            Flower get();
//        };
//
//        private static final Supplier<WebDriver> EDGE = () -> {
//
//            WebDriverManager.edgedriver().setup();
//            return new EdgeDriver();
//        };
//
//        private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();
//
//        static {
//            MAP.put("chrome", CHROME);
//            MAP.put("edge", EDGE);
//        }
//
//        public static WebDriver getDriver(String browserName) {
//            return MAP.get(browserName).get();
//
//        }
//
//    }
//
//
//
