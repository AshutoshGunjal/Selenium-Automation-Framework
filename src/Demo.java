import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		//invoke .exe file for chrome driver
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//create drive for chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());  // print title of the url page
		System.out.println(driver.getCurrentUrl()); // print current url
		
		driver.findElement(By.id("identifierId")).sendKeys("Username");
		driver.findElement(By.xpath("//*[@id=\'view_container\']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Learn more")).click();
//		System.out.println(driver.getPageSource()); // print page source
		
//		driver.get("http://faacebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.close();  // it closes the current tab in chrome
//		driver.quit();   // it closes all the child windows and closes the browser
	}
}
