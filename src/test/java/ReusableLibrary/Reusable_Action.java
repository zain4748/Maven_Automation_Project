package ReusableLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Reusable_Action {

    //test a static timeout so it can cover all explicit for all methods
    public static int timeout = 60;

    //setting dirver for return methods
    public static WebDriver setDriver()  {
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
        return driver;

    }//end of setDriver

    //create a mouse hover method
    public static void mouseHover(WebDriver driver,String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        Actions actions = new Actions(driver);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover on element " + elementName + " " + e);
        }
    }//end of mouseHover

    //create a click method
    public static void clickAction(WebDriver driver,String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickAction

    //create a sendkeys method
    public static void sendKeysAction(WebDriver driver,String xpath, String userValue,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userValue);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of sendkeys method

    //create a getText method
    public static String getTextAction(WebDriver driver,String xpath,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        String result = null;
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
        }
        return result;
    }//end of getTextAction method

    //create a submit method
    public static void submitAction(WebDriver driver,String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
        }
    }//end of

    public static String verifyTitle(WebDriver driver, String expectedTitle){
        WebDriverWait wait = new WebDriverWait(driver,10);
        String verifyTitle = driver.getTitle();
        if (verifyTitle.contains(expectedTitle)){
            System.out.println("My title matches");
        } else {
            System.out.println("Title doesn't match. Actual title is " + verifyTitle);
        }
        return verifyTitle;
    }//end of switch to tab by index


}//end of java class

