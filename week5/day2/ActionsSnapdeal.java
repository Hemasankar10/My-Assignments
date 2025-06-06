package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.Collections;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsSnapdeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//launch a browser
				ChromeOptions options=new ChromeOptions();
				options.addArguments("guest");
				ChromeDriver driver=new ChromeDriver(options);
				
				//load the URL
				driver.get("https://www.snapdeal.com/");
				
				//maximize the screen
				driver.manage().window().maximize();
				
				//add implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Go to "Men's Fashion" and "Sports Shoes"
				WebElement hover=driver.findElement(By.className("catText"));
				
				//instantiate the action class, webdriver wait and javascript executor
				WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds(10));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				Actions act=new Actions(driver);
				act.moveToElement(hover);
				
				WebElement shoes=driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
				act.click(shoes).perform();
				
				//print the num of shoes
				String count=driver.findElement(By.xpath("//div[@class='category-name-wrapper clearfix ']/span")).getText();
				System.out.println("Number of sports shoes : "+count);
				
				//click on training shoes
				WebElement trainingShoes=driver.findElement(By.xpath("//div[text()='Training Shoes']"));
				act.click(trainingShoes).perform();
				
				//sort the products from low to high price
				driver.findElement(By.className("sort-label")).click();
				driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
				
				Thread.sleep(3000);
				//verify the sorted price
				List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
				
				List<Integer> result= new ArrayList<>();
				
				for (WebElement each : price) {
					String text=  each.getText();
					String replace=text.replaceAll("[^0-9]","");
					
					result.add(Integer.parseInt(replace));
					
	
				}
				
				System.out.println("The values are : "+result);
				
				List<Integer> sortedList=new ArrayList<>(result);
				Collections.sort(sortedList);
				System.out.println("Sorted List : "+sortedList);
				
				
				if ((result).equals(sortedList)) {
					System.out.println("The price is sorted from low to high");
				} else {
					System.out.println("The price is not sorted correctly");
				}
				
				Thread.sleep(3000);
				//select any price range
				driver.findElement(By.xpath("(//div[@class='filter-content'])[1]/div/div[3]/div/input")).clear();
				driver.findElement(By.xpath("(//div[@class='filter-content'])[1]/div/div[3]/div/input")).sendKeys("600");
				driver.findElement(By.xpath("(//div[@class='filter-content'])[1]/div/div[4]/div/input")).clear();
				driver.findElement(By.xpath("(//div[@class='filter-content'])[1]/div/div[4]/div/input")).sendKeys("3000");
				driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
				
				Thread.sleep(3000);
				//filter any color
				WebElement color=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")));
				js.executeScript("arguments[0].click();", color);
				
				//optional wait
				wait.until(ExpectedConditions.elementToBeClickable(color));
				//color.click();
						
				Thread.sleep(3000);
				//verify the applied filters
				String appliedFilters=driver.findElement(By.xpath("//div[@class='filters-top-selected']/div/div[1]")).getText();
				System.out.println("The applied filters are : "+appliedFilters);
				String appliedFilters1=driver.findElement(By.xpath("//div[@class='filters-top-selected']/div/div[2]")).getText();
				System.out.println(appliedFilters1);
				
				//hover the first displayed product from training shoes and click on quick view
				WebElement product=driver.findElement(By.xpath("//div[@id='products']/section[1]/div[1]"));
				act.moveToElement(product).perform();
				WebElement view=driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div[1]"));
				act.click(view).perform();
				
				//cost and discount price
				String totalCost=driver.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']/div[2]/div[1]/span")).getText();
				System.err.println("Total Cost price is : "+totalCost);
				
				String discount=driver.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']/div[2]/div[2]/span[2]")).getText();
				System.out.println("Discount Percentage is : "+discount);
				
				String cost=driver.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']/div[2]/div[2]/span[1]")).getText();
				System.out.println("Discounted Cost Price is : "+cost);
				
				//close the pop up window and the main window
				WebElement closePopUp=driver.findElement(By.xpath("//div[@class='close close1 marR10']/i"));
				act.click(closePopUp).perform();
				
				//take snapshot of the shoes
				File src = driver.getScreenshotAs(OutputType.FILE);
				File dst=new File("./snap/snapdealshoes.png");
				FileUtils.copyFile(src, dst);
				
				
				//driver.close();
				
				
				
				
	}

}
