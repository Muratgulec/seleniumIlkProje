package day05_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        System.setProperty("chromeDriver","src/main/resources/drivers/chromedriver");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        //city bike aratalım
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);
        //Hybrid Bikes bölümüne tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();
        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        driver.findElement(By.id("pid90"));
        driver.findElement(By.id("pids34"));

    }

}
