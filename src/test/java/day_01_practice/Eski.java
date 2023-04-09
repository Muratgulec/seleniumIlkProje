package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eski {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("chromeDriver","src/main/resources/drivers/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            WebDriver driver =new ChromeDriver(options);
            // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
            driver.get("https://testpages.herokuapp.com/styled/calculator");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            // ilk kutucuga 20 giriniz
            WebElement ilkKutucuk=driver.findElement(By.id("number1"));
            ilkKutucuk.sendKeys("20"+ Keys.ENTER);
            Thread.sleep(2000);

            // ikinci kutucuga 30 giriniz
            WebElement ikinciKutucuk=driver.findElement(By.id("number2"));
            ikinciKutucuk.sendKeys("30"+Keys.ENTER);
            Thread.sleep(2000);

            // calculate'e tıklayınız
            WebElement calculate=driver.findElement(By.id("calculate"));
            //calculate.sendKeys(Keys.ENTER);
            //calculate.submit();
            calculate.click();
            Thread.sleep(2000);

            // sonucu yazdırınız
            System.out.println("Sonuc: " +driver.findElement(By.id("answer")).getText());
            // sonuc webelement oldugu icin getText() ile String e cevirip sonucu gorduk ..


            // sayfayi kapatiniz
            driver.close();

        }
}
