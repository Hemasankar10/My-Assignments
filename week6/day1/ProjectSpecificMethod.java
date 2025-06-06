package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public  RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preConditions (String browser, String url, String uName, String pwd) throws InterruptedException {
		
				if (browser.equalsIgnoreCase("chrome")) {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("guest");
				    driver=new ChromeDriver(options);
				} else if (browser.equalsIgnoreCase("edge")) {
					EdgeOptions opt = new EdgeOptions();
					opt.addArguments("guest"); 
					driver=new EdgeDriver(opt);
				} 
				//url
				driver.get(url);
				
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//get the username and password and do login
				driver.findElement(By.id("username")).sendKeys(uName);
				driver.findElement(By.id("password")).sendKeys(pwd);
				driver.findElement(By.id("Login")).click();
				
				//click on toggle menu and click view all and then legal entities from app launcher
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
				
				Actions act=new Actions(driver);
				WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
				act.scrollToElement(legalEntities).perform();
				act.click(legalEntities).perform();
				
				//click the dropdown of legal entities and select new legal entity
				driver.findElement(By.xpath("//a[@title='Legal Entities']/following::lightning-icon[1]")).click();
				
				
				WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				WebElement newEntity=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Legal Entity']")));
				js.executeScript("arguments[0].click();",newEntity);
				Thread.sleep(5000);
		
	}
	
	
	@AfterMethod
	public void postConditions () {
		
		driver.close();
	}
	 
}
