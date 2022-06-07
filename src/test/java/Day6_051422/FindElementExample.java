package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementExample {
    //go to bing click on second element of the links by using class and index
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome option argument
        ChromeOptions options = new ChromeOptions();
        //set the condition in to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize your driver
        options.addArguments("start-maximized");
        //define the web driver I am going to use
        WebDriver driver = new ChromeDriver(options);
        //navigate to bing home page
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(3000);

        //Click on Image using class property with index of 1
       //to ignore white space in the property value we can use contain command in x path
        driver.findElements(By.xpath("//li[contain(@class,'scope')]")).get(1).click();


    }//end of main
}//end of class
