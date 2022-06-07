package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MortgageCalc {
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
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //declare java script executor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //scroll to pixel 400 or 800 on mortgage calc website
        //jse.executeScript("scroll(0,400)");

        //wait a bit for browser to perform scrolling
        //Thread.sleep(3000);

        //declare a web element  variable that we want to scroll into
        WebElement shareButton = driver.findElement(By.xpath("//*[@id = 'share_button']"));

        //scroll into share this calculation button
        jse.executeScript("arguments[0].scrollIntoView(true);", shareButton);
        Thread.sleep(2000);

        //click on the share this calculation button
        shareButton.click();
        Thread.sleep(2000);

        //scroll back up
        jse.executeScript("scroll(0,-400)");
        Thread.sleep(2000);

        //quit the chrome driver
        driver.quit();




    }//end of main
}//end of java class
