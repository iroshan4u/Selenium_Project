package pkg_Iro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/switch-window");

		WebElement alertbtn = driver.findElement(By.id("alert-button"));
		alertbtn.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.quit();
	}
}
