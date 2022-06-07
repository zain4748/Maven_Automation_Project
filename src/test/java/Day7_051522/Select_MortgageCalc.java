package Day7_051522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_MortgageCalc {
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
        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //select start month from the dropDown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //define select command
        Select dropDown = new Select(startMonth);

        //select by visible text
        dropDown.selectByVisibleText("Jun");

        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));

        Select loanTypeDropdown = new Select(loanType);

        loanTypeDropdown.selectByVisibleText("FHA");
    }//end of main
}//end of java class
