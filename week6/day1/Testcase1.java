package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase1 extends ProjectSpecificMethod {

	@Test
	public void main() throws InterruptedException  {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Hemalatha");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		Thread.sleep(3000);
		String name=driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("The legal entity name is : "+name);
		
		/*if (name.equals(nameEntity)) {
		
		System.out.println("The entity name is same");
	} else {

		System.out.println("The name is not same");
	}
	*/
		
	}
	

}
