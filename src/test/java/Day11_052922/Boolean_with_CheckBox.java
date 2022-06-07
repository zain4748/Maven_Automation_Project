package Day11_052922;

import ReusableLibrary.Reusable_Action;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Boolean_with_CheckBox {

        //declare the local driver outside so that it can be reusable with other annotation method
        WebDriver driver;

        //before suite will set the driver you are using

        @BeforeTest
        public void SetChromeDriver() {

            driver = Reusable_Action.setDriver();

        }//end of before suite annotation

        //test case 1: navigate to google and enter a keyword on search field

        @Test
        public void Yahoo_Stay_Singed_In_checkbox_Verification() throws InterruptedException {

            driver.navigate().to("http://yahoo.com");

            Reusable_Action.clickAction(driver,"//*[text()='Sign In']","Sign In");
            WebDriverWait wait = new WebDriverWait(driver,10);
            Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type,'checkbox']"))).isSelected();
            System.out.println("Is element checked?" + elementState);



        }//end of test

    @AfterSuite
    public void quitSession(){

            driver.quit();
    }//end of after suite
    }//end of java class
