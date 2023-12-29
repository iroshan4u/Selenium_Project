
package pkg_Iro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtons {

	// this is to automate radio buttons. checkboxess also follow same syntax
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/radiobutton");

		WebElement radionbtn = driver.findElement(By.id("radio-button-1"));
		radionbtn.click();

		WebElement radionbtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radionbtn2.click();

		// work both below lines
		WebElement radionbtn3 = driver.findElement(By.xpath("//input[@value='option3']"));
		// WebElement radionbtn3 =
		// driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		radionbtn3.click();

		Thread.sleep(3000);
		driver.quit();
	}
}
