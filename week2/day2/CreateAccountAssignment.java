package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignment {

	public static void main(String[] args) {
		
		       //instantiate the browser driver
				ChromeOptions options = new ChromeOptions();
				options.addArguments("guest");
				ChromeDriver driver=new ChromeDriver(options);
				
				// load URL
				driver.get("http://leaftaps.com/opentaps/");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//to find and add inputs in username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				//to find and add inputs in password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//to click login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//click on crm/sfa link
				driver.findElement(By.partialLinkText("CRM")).click();
				
				//click on account tab
				driver.findElement(By.linkText("Accounts")).click();
				
				//Click create account
				driver.findElement(By.linkText("Create Account")).click();
				
				//click on account name
				driver.findElement(By.id("accountName")).sendKeys("Hemalathakavya");
				
				//enter the description as Selenium Automation Tester.
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				
				// selecting computer software options from industry dropdown
				WebElement industryDD = driver.findElement(By.name("industryEnumId"));
				Select sel=new Select(industryDD);
				sel.selectByValue("IND_SOFTWARE");
				
				
				//Select "S-Corporation" as ownership using SelectByVisibleText
				WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
				Select sel1=new Select(ownershipDD);
				sel1.selectByVisibleText("S-Corporation");
				
				//Select "Employee" as the source using SelectByValue
				WebElement sourcingDD = driver.findElement(By.id("dataSourceId"));
				Select sel2=new Select(sourcingDD);
				sel2.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
				WebElement marketingCampaignDD=driver.findElement(By.id("marketingCampaignId"));
				Select sel3=new Select(marketingCampaignDD);
				sel3.selectByIndex(6);
				
				//Select "Texas" as the state/province using SelectByValue
				WebElement provinceDD=driver.findElement(By.id("generalStateProvinceGeoId"));
				Select sel4=new Select(provinceDD);
				sel4.selectByValue("TX");
				
				//Click on the create account button
				driver.findElement(By.className("smallSubmit")).click();
				
				//get title of the page
				String title=driver.getTitle();
				
			    System.out.println(title);
			    
			    //close the window
			    driver.close();

	}

}
