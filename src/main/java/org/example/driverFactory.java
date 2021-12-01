package org.example;



import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;



public class driverFactory {
    public static final Supplier<WebDriver> CHROME=()->{
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };
    public static final Supplier<WebDriver> EDGE=()->{
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    };

    private static final Map<String, Supplier<WebDriver>> MAP=new HashMap<>();

    static {
        MAP.put("chrome", CHROME);
        MAP.put("edge", EDGE);
    }
    public static WebDriver getDriver(String browserName) {
        return MAP.get(browserName).get();
    }



}