package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_101_WeightWatcher {
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
        //now navigate to the website

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11214");
        zipCode.add("11215");
        zipCode.add("11218");
        for (int i = 0; i < zipCode.size(); i++) {


            driver.navigate().to("https://www.weightwatchers.com/us/");
            Thread.sleep(3000);
            //inspecting the attend button
            try {
                WebElement attendButton = driver.findElement(By.xpath("//*[@da-label='Attend']"));
                attendButton.click();

            } catch (Exception e) {
                //print the statement
                System.out.println("unable to locate the attendButton" + e);
            }//end of exception

            try {
                //inspection the unlimited Button
                driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();

            } catch (Exception e) {
                //print the statement
                System.out.println("Unable to click unlimitedButton" + e);
            }
            try {
                //inspect the studio button
                WebElement studioButton = driver.findElement(By.xpath("//span[text() = 'Studio']"));

                studioButton.click();
                Thread.sleep(1000);

            } catch (Exception e) {
                //printing
                System.out.println("Unable to click on studio" + e);
            }//end of exception
            try {
                //inspect the zipSearch bar
                WebElement zipSearch = driver.findElement(By.xpath("//*[@title='location-search']"));
                zipSearch.clear();
                zipSearch.sendKeys(zipCode.get(i));
                ;

            } catch (Exception e) {
                //printout the statement
                System.out.println("Unable to clear and enter zipcode" + e);
            }//END OF EXCEPTION
            try {
                //inspect the searchArrow
                WebElement searchArrow = driver.findElement(By.xpath("//*[@id = 'location-search-cta']"));
                searchArrow.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                //PRINT OUT
                System.out.println("Unable to search button " + e);
            }//end of exception
            //get list of studios and click on studio link
            try {
                ArrayList<WebElement> searchResults = new ArrayList<>(driver.findElements(By.xpath("//*[@class='linkContainer-1NkqM']")));
                if (i == 0) {
                    searchResults.get(1).click();
                } else if (i == 1) {
                    searchResults.get(2).click();
                } else if (i == 2) {
                    searchResults.get(0).click();
                }
            } catch (Exception e) {
                System.out.println("Unable to see list of studio locations" + e);
            }//end of exception
            try {
                String studioAddress = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                Thread.sleep(1000);
                System.out.println("The address for the studio is" + studioAddress);
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to print studio address" + e);
            }//end of exception
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll 0,400");

            } catch (Exception e) {
                //printing exception
                System.out.println("Unable to scroll " + e);
            }//end of exception
            //print studio schedule
            try {
                String studioSchedule = driver.findElement(By.xpath("//*[@class = 'scheduleContainerMobile-1RfmF']")).getText();
                System.out.println("The schedule of the studio " + studioSchedule);
            } catch (Exception e) {
                System.out.println("The schedule to the studio " + e);
            }//end of exception

        }//end of main
    }
}//end of jAva class