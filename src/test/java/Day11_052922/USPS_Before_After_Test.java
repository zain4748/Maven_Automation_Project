package Day11_052922;

import ReusableLibrary.Reusable_Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class USPS_Before_After_Test {

    //declare the local driver outside so that it can be reusable with other annotation method
    WebDriver driver;

    //before suite will set the driver you are using

    @BeforeTest
    public void SetChromeDriver(){

        driver = Reusable_Action.setDriver();

    }//end of before suite annotation

    //test case 1: navigate to google and enter a keyword on search field

    @Test
    public void USPS_Tab_Count() throws InterruptedException {

            driver.navigate().to("http://usps.com");

        WebDriverWait wait = new WebDriverWait(driver,10);

        List <WebElement> tabCount = (List<WebElement>) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contain(@call,'menuheader')]")));

        System.out.println("Tab count is " + tabCount.size());

        for (int i =0; i < tabCount.size(); i++){

            driver.navigate().to("http://www.usps.com");

            //Thread.sleep(1500);

            tabCount = (List<WebElement>) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contain(@call,'menuheader')]")));

            tabCount.get(i).click();

        }//end of forLoop

    }//end of test 1



    @AfterTest
    public void quitSession(){
        driver.quit();
    }//end of after suite

}//End of Java Class