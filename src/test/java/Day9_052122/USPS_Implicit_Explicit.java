package Day9_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class USPS_Implicit_Explicit {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        //

        //driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        //now navigate to the Hotels website
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(3000);

        //call mouse action
        Actions actions = new Actions(driver);

        //hover to quick tool
        WebDriverWait wait = new WebDriverWait(driver,8);

        //hover to quik tool
        WebElement quickTools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Quick Tool']")));
        actions.moveToElement(quickTools).perform();

        //click on track a package
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']")));

        //click and then type on package field
        WebElement packageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tracking-input']")));
        packageField.click();
        packageField.sendKeys("1222222245");

        //

    }//end of main method
}////end of java class
