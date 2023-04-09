package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Selenium {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chromedriver","src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

    }



}
