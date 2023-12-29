package pkg_Iro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class SwitchWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement newTab = driver.findElement(By.id("new-tab-button"));
		newTab.click();

		// store current window opened
		String originalHandler = driver.getWindowHandle();

		// Switch to new window opened (most of time already switched to the new window
		// when it open)
		for (String handle1 : driver.getWindowHandles()) {
			if (!originalHandler.contentEquals(handle1)) {
				driver.switchTo().window(handle1);
				break;
			}

		}

		// Switch back to original browser (first window)
		driver.switchTo().window(originalHandler);

		driver.quit();
	}
}
