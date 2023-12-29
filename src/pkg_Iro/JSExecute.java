package pkg_Iro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/modal");

		WebElement modalbtn = driver.findElement(By.id("modal-button"));
		modalbtn.click();

		WebElement closebtn = driver.findElement(By.id("close-button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", closebtn);

		driver.quit();
	}
}
