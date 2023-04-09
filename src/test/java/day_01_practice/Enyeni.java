package day_01_practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Enyeni {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chrome.driver","src/main/resources/drivers/chromedriver");


        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+ Keys.ENTER);


        List<WebElement> linklerListesi =driver.findElements(By.tagName("a"));

        System.out.println(linklerListesi.size());


        int sayac = 1;
        for (WebElement each:linklerListesi) {
            System.out.println(sayac+ ". link"+ each.getText());
            sayac++;

        }


    }
}
