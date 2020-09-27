import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}
}
