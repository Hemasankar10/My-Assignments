package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePhonePrice {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//load the URL
		driver.get("https://www.amazon.in/");
		driver.navigate();
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the search button and type bag for boys and click search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones", Keys.ENTER);
	
		
		//get the price of the mobile listed
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		
		List<Integer> result=new ArrayList<Integer>();
		
		//using enhanced for loop to get the sorted mobile prices in a list
		for (WebElement each : price) {
			
			String val=each.getText();
			String replace=val.replaceAll(",", "");
			
			int mobile=Integer.parseInt(replace);
			
			result.add(mobile);
			
			
		}

		Collections.sort(result);
		System.out.println(result);
	}

}
