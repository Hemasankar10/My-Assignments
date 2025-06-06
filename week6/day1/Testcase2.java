package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Testcase2 extends ProjectSpecificMethod {

	@Test
	public  void main() throws InterruptedException {
				
				
				driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
				driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForce");
				
				WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				
				WebElement status = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Status']")));
				js.executeScript("arguments[0].click();", status);
				wait.until(ExpectedConditions.elementToBeClickable(status));
				//status.click();
				Thread.sleep(3000);
				
				WebElement active=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-base-combobox-item[@data-value='Active']")));
				js.executeScript("arguments[0].click();", active);
				//wait.until(ExpectedConditions.elementToBeClickable(active));
				//active.click();
				
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				
				//handling and verifying the alert
				String alert=driver.findElement(By.xpath("//h2[@class='slds-truncate slds-text-heading_medium']")).getText();
				System.out.println("Alert message : "+alert);
				String verifyAlert = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']//a")).getText();
				System.out.println("Review the following field : "+verifyAlert);
				
				/*driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Hemalatha");
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				String name=driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
				System.out.println("The legal entity name is : "+name);
				*/
				
				driver.findElement(By.xpath("//button[@name='CancelEdit']")).click();
		
	}

}
