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

public class USPS_List_WebElement {

    //declare the local driver outside so that it can be reusable with other annotation method
    WebDriver driver;

    //before suite will set the driver you are using

    @BeforeTest
    public void SetChromeDriver(){

        driver = Reusable_Action.setDriver();

    }//end of before suite annotation

    @Test()
    public void USPS_Tabs_Count() throws InterruptedException {

        //navigate to USPS
        driver.navigate().to("http://www.usps.com");

        //declare the explicit wait for the tabs
        WebDriverWait wait = new WebDriverWait(driver,10);
        //store the navigation tab as a list to get the count
        List <WebElement> tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
        //print the tab count
        System.out.println("Tab count is " + tabsCount.size());

        for (int i = 0; i < tabsCount.size(); i++){

            //navigate again or else its gonna give your error
            driver.navigate().to("http://www.usps.com");
            Thread.sleep(1500);
            tabsCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            //click on tab
            tabsCount.get(i).click();
            Thread.sleep(2000);

        }

    }//end of test

    @AfterTest
    public void quitSession(){

        driver.quit();
    }//end of after suite
}
