package Training;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class OpenExistingAccount {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Started opening Verizon Page to Login");
		driver.get("https://www.verizon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gnav20-sign-id")).click();
		driver.findElement(By.id("gnav20-sign-id-list-item-1")).click();
		driver.findElement(By.id("IDToken1")).sendKeys("vishnu.bovilla25@gmail.com");
		// driver.switchTo().frame("//button[@id='continueBtn']").close();
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@id='continueBtn']")).click();
//		Actions acct = new Actions(driver);
//		acct.moveToElement(driver.findElement(By.xpath("//button[@id='continueBtn']"))).click().perform();
//		
////		WebElement username = driver.findElement(By.id("IDToken1"));
////		System.out.println(username.getText());
//		driver.findElement(By.id("IDToken2")).sendKeys("vishnu@1996");
//		driver.findElement(By.id("continueBtn")).click();
//		driver.findElement(By.id("IDToken2")).sendKeys("kluniversity");
//		driver.findElement(By.id("continueBtn")).click();
		TakesScreenshot mainpage = ((TakesScreenshot) driver);
		File SrcFile = mainpage.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("target\\screenshot\\verizon_images_2.png");
		Files.copy(SrcFile, DestFile);
		System.out.println("Ended Verizon page");
		// driver.close();

	}

}
