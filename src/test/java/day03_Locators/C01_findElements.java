package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_findElements {
    public static void main(String[] args) {


        System.setProperty("chromeDriver", " src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        //amazon sayfasinda kac tane link var yazdiriniz
        List<WebElement> linklerListeti= driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi ="+ linklerListeti.size());

        //linkleri yazdiralim

        for (WebElement W: linklerListeti) {
            System.out.println(W.getText());

        }
        driver.close();

    }
}
