package ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class que2 {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String cTitle=driver.getTitle();
		System.out.println("Title from website:"+cTitle);
		String eTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(cTitle.equals(eTitle)) {
			System.out.println("Same as expected");
		}
		else {
			System.out.println("Not as excepted");
		}
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		txtBoxl.sendKeys("chocolates");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String product1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
		System.out.println(product1);
		String product2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
		System.out.println(product2);
		String product3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
		System.out.println(product3);
		String product4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
		System.out.println(product4);
		String product5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[3]/div[1]/h2/a/span")).getText();
		System.out.println(product5);
		driver.findElement(By.xpath("//*[@id=\"p_89/Cadbury\"]/span/a/div/label/i")).click();
		System.out.println("Filtered using Cadbury");
	}
}

