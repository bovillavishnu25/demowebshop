package DemoShopweb;

import java.util.List;
//import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebShopDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println("-------*******Started Opening DemoShopWeb Application******------");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("ico-login")).click();
		WebElement user = driver.findElement(By.id("Email"));
		user.sendKeys("demowstest@gmail.com");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("demo@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(), 'Apparel & Shoes')])[3]")).click();
		driver.findElement(By.xpath("//h2//a[text()='Blue Jeans']")).click();
		driver.findElement(By.id("addtocart_36_EnteredQuantity")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-36']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@name='estimateshipping']")).click();
		String storepickup ="Pick up your items at the store (put your store address here)";
		String aha = driver.findElement(By.xpath("(//span[@class='option-description'])[4]")).getText();
		System.out.println(aha);
		if(storepickup.equals(aha)) 
		{
			System.out.println("Text Content:- " + storepickup + " is present");
		}
		else {
			System.out.println("Text Content:- " + storepickup + " is Not present");
		}
		
		Actions shp = new Actions(driver);
//		Actions card = shp.moveToElement(shop);
//		WebElement go = driver.findElement(By.xpath("//input[@value='Go to cart']"));
//		card.moveToElement(go).click();
		System.out.println("-------******Successfully Scenarios Executed ******-------");
		//driver.quit();

	}

}
