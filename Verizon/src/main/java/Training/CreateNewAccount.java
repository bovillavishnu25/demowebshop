package Training;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewAccount {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Start Open Browser");
		driver.get("https://www.verizon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		List<WebElement> all = driver.findElements(By.id("tilelets-hero"));
//		
//		for(WebElement a : all) {
//			System.out.println(a.getText());
//		}
		Actions act = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[text()=' Important Consumer Information']"));
		
		act.moveToElement(move);
		System.out.println(move.getText());
		
//		driver.findElement(By.id("gnav20-sign-id")).click();
//		driver.findElement(By.xpath("//a[text()='Register'][1]")).click();
//		driver.findElement(By.xpath("(//div[@class='register-service-accordion-block'])[2]")).click();
//		driver.findElement(By.id("mobileNumber")).sendKeys("9000822715");
//		driver.findElement(By.id("nextButton")).click();
//		
		driver.close();
		
		System.out.println("Succesfully Launched Browser");
		
	}

}
