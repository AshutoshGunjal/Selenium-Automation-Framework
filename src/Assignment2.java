import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");

		Select s2 = new Select(driver.findElement(By.id("Childrens")));
		s2.selectByIndex(5);

		driver.findElement(By.xpath("//div[@class='span span15 datePicker']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}
}
