package pkg_Iro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		driver.findElement(By.id("accept-choices")).click();

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		WebElement continueButton = driver.findElement(By.xpath("//button[text()='Try it']"));

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cbutton = wait.until(ExpectedConditions.elementToBeClickable(continueButton));

		cbutton.click();
		Thread.sleep(3000);

		// e1.click();
		driver.close();
	}
}
