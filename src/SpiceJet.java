import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		
		s.selectByValue("AED");
		
		driver.findElement(By.id("divpaxinfo")).click();;
		//Adult Dropdown
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByVisibleText("5");
		//Child Dropdown
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByIndex(2);
		//Infant Dropdown
		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByIndex(3);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();;
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PAT']")).click();
	}
}
