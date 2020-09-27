import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		
		String text = "Ashutosh";
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(4000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(4000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();;
		
		
		
	}
}
