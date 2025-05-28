package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestcaseAmazon {

	public static void main(String[] args) {
		//launch a browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//load the URL
		driver.get("https://www.amazon.in/");
		
		driver.navigate();
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the search button and type bag for boys and click search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//printing the total number of results
		String results=driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
		System.out.println(results);
		
		//select the first two brands
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Safari to narrow results']//i[@class='a-icon a-icon-checkbox']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Skybags to narrow results']//i[@class='a-icon a-icon-checkbox']")).click();
		
		
		//select the newest arrival from sort
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//div[@class='a-popover-inner']//li[5]")).click();
		
		//print name and price of first bag shown
		String bagName=driver.findElement(By.xpath("//div[@role='listitem']//h2[1]")).getText();
		System.out.println("Name of the bag: "+bagName);
		
		String price=driver.findElement(By.xpath("(//div[@data-cy='price-recipe']//span[@class='a-price'])[1]")).getText();
		System.out.println("Price of the bag: "+price);
		
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		
		driver.close();
		
	}

}
