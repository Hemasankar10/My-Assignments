package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParametrizationForTC1 extends ProjectSpecificMethod {

	@Test(dataProvider = "fetchEntityName")
	public void main(String entityName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(entityName);
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
		@DataProvider(name="fetchEntityName")
		public String[][] sendLegalEntityName() {
			
			String[][] data=new String[3][1];
			
			data[0][0]="Salesforce Automation by Hema";
			data[1][0]="Salesforce Automation by Hemalatha";
			data[2][0]="Salesforce Automation by kokila";
			
			return data;
			
		}
		



}
