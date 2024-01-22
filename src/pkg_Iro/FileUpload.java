package pkg_Iro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
		fileUpload.sendKeys("ISTQB-CT.pdf");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
