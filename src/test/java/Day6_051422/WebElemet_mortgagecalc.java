package Day6_051422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElemet_mortgagecalc {
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

        //click, clear and enter new value on home value field
        WebElement homeVlaue = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeVlaue.click();
        homeVlaue.clear();
        homeVlaue.sendKeys("450000");

        //click on % ratio button
        driver.findElement(By.xpath("//*[@value='percent']")).click();

        //click, clear and enter new data on down payment field
        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        downPayment.click();
        downPayment.clear();
        downPayment.sendKeys("5");
    }
}
