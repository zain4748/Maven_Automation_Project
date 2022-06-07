package Practice_QA22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTestPractice {
    public static void main(String[] args) {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        //define the web driver that I am going to use
        WebDriver driver = new ChromeDriver();

        //go to Google home page
        driver.navigate().to("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

        //locate element for search field ad type keyword 'cars'
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");


         //quit the driver
        //driver.quit();

    }//end of main  method
}//end of java class
