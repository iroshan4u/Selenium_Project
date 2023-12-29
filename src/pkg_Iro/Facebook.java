package pkg_Iro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement btn =  driver.findElement(By.xpath("//button[text()='Allow all cookies']"));
		//Thread.sleep(3000);
		btn.click();
		WebElement btn2 =  driver.findElement(By.xpath("//a[text()='Create new account']"));
		btn2.click();
		Thread.sleep(3000);
		
		WebElement months = driver.findElement(By.id("month"));
		Select  monthsSelect = new Select(months);
		monthsSelect.selectByVisibleText("Sep");
		
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		Thread.sleep(3000);
		daySelect.selectByIndex(20);
		
	
		
		WebElement year = driver.findElement(By.id("year"));
		Select  month = new Select(year);
		month.selectByVisibleText("1990");
		
		
		

	}

}
