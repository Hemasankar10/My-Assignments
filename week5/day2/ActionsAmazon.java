package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ActionsAmazon {

	public static void main(String[] args) throws IOException {

				//launch a browser
				ChromeOptions options=new ChromeOptions();
				options.addArguments("guest");
				ChromeDriver driver=new ChromeDriver(options);
				
				//load the URL
				driver.get("https://www.amazon.in/");
				
				//maximize the screen
				driver.manage().window().maximize();
				
				driver.navigate();
				
				//add implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//locate the search button and type bag for boys and click search
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				//get the price of the first product displayed
				String price=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/div[3]//span[@class='a-price-whole'])[1]")).getText();
				System.out.println("Price of the first displayed product is : "+price);
				
				WebElement rating = driver.findElement(By.xpath("(//i[@data-cy='reviews-ratings-slot'])[1]"));
				rating.click();
				
				WebElement customerRating = driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-left']/div[2]/span"));
				String customerView=customerRating.getText();
				System.out.println("Total customer rating : "+customerView);
				
				WebElement starRating = driver.findElement(By.xpath("//h2[@id='acr-popover-title']/span[1]"));
				String overAllStars=starRating.getText();
				System.out.println("Overall star rating : "+overAllStars);
				
				//click the first product image
				driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
				
				
				//to handle the window set is used
				Set<String> newWind=driver.getWindowHandles();
				
				//to handle the child window convert set to list
				List<String> childWindow=new ArrayList<String>(newWind);
				
				//switch to child window
				driver.switchTo().window(childWindow.get(1));
				
				//take screenshot of the page
				File source=driver.getScreenshotAs(OutputType.FILE);
				File destination=new File("./snap/product.png");
				FileUtils.copyFile(source, destination);
				
				//Add the product to the cart
				driver.findElement(By.id("add-to-cart-button")).click();
				
				//get the subtotal of the cart
				String total=driver.findElement(By.className("a-price-whole")).getText();
				System.out.println(total);
				
				if (price.equals(total)) {
					System.out.println("The price matches!!!");
				} else {
					System.out.println("Please check the price:)");

				}
				
				driver.close();
				driver.quit();
	}

}
