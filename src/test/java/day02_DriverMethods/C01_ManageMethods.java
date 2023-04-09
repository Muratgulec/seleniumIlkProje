package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", " src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments(" --remote-allow-origins=*"));
        System.out.println("sayfa konumu =" +driver.manage().window().getPosition());
        driver.manage().window().maximize();// acilan browseri maximize yapar
        driver.get("https://techproeducation.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();//sayfayı aşağıya indirir
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());




    }

}
