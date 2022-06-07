package Day5_050822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeoption_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        //setup your chrome driver with web driver manager
        WebDriverManager.chromedriver().setup();

        //define the web driver I am going to use
        WebDriver driver = new ChromeDriver();

        //go to Google home page
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);

        //maximize the driver
        driver.manage().window().maximize(); //for mac use window();fullScreen();

        //locate element for search field and type keyword 'cars'
        driver.findElement(By.xpath("//*[@name='q')")).sendKeys("cars");

        //submit on Google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //capture the google search and println
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stat']")).getText();

        //System.out.println("Result is " + searchResult);

        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");

        //String  replaceParanth = arrayResult[3].replace ("(","").replace(")","");
        System.out.println("My search number is " + arrayResult[1]);

        //quit the driver

        driver.quit();

    }//end of main method
}//end of java class


