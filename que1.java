package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class que1 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.in/Ferrero-Rocher-Pack-24-Pieces/dp/B07G9GDQJD/ref=sr_1_2?keywords=ferroche+chocolate&qid=1683194217&sprefix=ferro%2Caps%2C1095&sr=8-2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(5000);
        driver.get("https://www.amazon.in/Ferrero-Rocher-Pack-24-Pieces/dp/B07G9GDQJD/ref=sr_1_2?keywords=ferroche%2Bchocolate&qid=1683194217&sprefix=ferro%2Caps%2C1095&sr=8-2&th=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@name=\"proceedToRetailCheckout\"] "));
        Thread.sleep(5000);
    }
}
