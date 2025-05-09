package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
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
				
				//click on leads button
				driver.findElement(By.linkText("Leads")).click();
				
				//click on create lead button
				driver.findElement(By.linkText("Create Lead")).click();
				
				//enter firstname
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hemalatha");
				
				//enter lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sankar");
				
				//enter the company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hcltech");
				
				//enter the title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumJava course");
		
				//click create lead button
				driver.findElement(By.className("smallSubmit")).click();
				
				//get title of the page
				String title=driver.getTitle();
				
			    System.out.println(title);
			    
			    //close the window
			    driver.close();	

	}

}
