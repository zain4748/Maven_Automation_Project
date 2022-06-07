package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Automtion_101_BingSearchTest {
    public static void main(String[] args) throws InterruptedException {
        // make an array list for countries
        ArrayList<String> Country = new ArrayList<>();

        //Add countries in you array list

        Country.add("Pakistan ");
        Country.add("USA ");
        Country.add("Turkey ");
        Country.add("India ");
        Country.add("United Kingdom ");

        //using forLoop to execute or to define my array list
        for ( int i = 0; i < Country.size(); i++){

        //setup your Chrome Driver with Web Driver Manager
            WebDriverManager.chromedriver().setup();

            //Define your Chorme Driver
            WebDriver driver = new ChromeDriver();

            //Navigate to bing search home page
            driver.navigate().to("https://www.bing.com");

            //maximize the screen
            driver.manage().window().maximize();
            //to make your browser to run a little fast we use Thread
            Thread.sleep(3000);

            //Locate element for search field and type in keyword 'country'
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("country");

            //Submit on bing search button
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();

            //Capture the bing search and println
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            //Extract out the number and println the number only
            String[] arrayResult = searchResult.split("  ");

            //Print out the Result
            System.out.println(" Total counrty search for " + Country.get(i) + " is " + arrayResult[0]);

            //quit the driver
            driver.quit();

        }//end of forLoop



    }//end of main method
}//end of java class
