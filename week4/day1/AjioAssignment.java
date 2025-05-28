package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;

public class AjioAssignment {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		
		//EdgeDriver driver=new EdgeDriver();
		
		//load url
		driver.get("https://www.ajio.com/");
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//search for bags
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		
		//select the gender as men and select the category as fashion bags
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		driver.findElement(By.xpath("//label[contains(@class,'nestedcategory facet-linkname-Men - Fashion Bags')]")).click();
		
		//get the no of items found
		String itemsFound=driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println(itemsFound);
		
		//to get brand names
		List<WebElement> brand=driver.findElements(By.className("brand"));
		List<String> brands = new ArrayList<>();
		
		for (WebElement each : brand) {
			String brandDisplayed=each.getText();
			brands.add(brandDisplayed);
		}
		
		System.out.println(brands);
		
		
		
		//to get all the bagname and print it
		List<WebElement> bagName=driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		List<String> bagNames= new ArrayList<String>();
		
		for (WebElement each : bagName) {
			
			String prodName=each.getText();
			bagNames.add(prodName);
			
		}
		System.out.println(bagNames);

	}

}
