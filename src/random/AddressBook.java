package random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AddressBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch URL
		driver.get("http://35.244.35.131/addressbook/");

		// click on NEw Contact Button
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath("v-Notification-description"));
			driver.findElement(By.xpath("v-Notification-description")).click();
		} catch (Exception e) {

		} finally {

		}
		Thread.sleep(1000);
		WebElement newContact = driver.findElement(By.xpath("//span[@class='v-button-caption']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", newContact);
		// newContact.click();
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id = 'gwt-uid-5']"));
		firstName.sendKeys("Aakash");
		WebElement lastName = driver.findElement(By.xpath("//input[@id = 'gwt-uid-7']"));
		lastName.sendKeys("Shinghal");
		WebElement phone = driver.findElement(By.xpath("//input[@id = 'gwt-uid-9']"));
		phone.sendKeys("8115153756");
		WebElement Email = driver.findElement(By.xpath("//input[@id = 'gwt-uid-11']"));
		Email.sendKeys("aakash");
		WebElement date = driver.findElement(By.xpath("//input[@id = 'gwt-uid-13']"));
		date.sendKeys("6/17/90");
		Thread.sleep(1000);
		WebElement save = driver.findElement(By.xpath("(//span[@class='v-button-caption'])[2]"));
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", save);

		// CLick on FIlter button
		System.out.println("trying to click on filter");
		Thread.sleep(2000);
		WebElement searchBox = driver
				.findElement(By.xpath("//input[@class='v-textfield v-widget v-has-width v-textfield-prompt']"));
		searchBox.sendKeys("Aakash");
		searchBox.sendKeys(Keys.ENTER);

	}

}
