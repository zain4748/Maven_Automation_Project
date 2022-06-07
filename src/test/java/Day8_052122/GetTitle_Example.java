package Day8_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle_Example {
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
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);

        //Captue the title of the page and compare it with your expected title GOOGLE
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Google")){

            System.out.println("My title matches");

        }else {

            System.out.println("Title doesn't match. Actual title is" + actualTitle);

        }
    }
}
