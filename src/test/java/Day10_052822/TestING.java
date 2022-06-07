package Day10_052822;

import ReusableLibrary.Reusable_Action;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestING {

    //declare the local driver outside so that it can be reusable with other annotation method

    WebDriver driver;

    //before suite will set the driver you are using

    @BeforeTest
    public void SetChromeDriver(){

        driver = Reusable_Action.setDriver();

    }//end of before suite annotation

    //test case 1: navigate to google and enter a keyword on search field

    @Test(priority = 1)
    public void SearchForKeyword(){

        driver.navigate().to("http://www.google.com");

        //enter a keyword on search field
        Reusable_Action.sendKeysAction(driver,"//*[@name='q']","BMW","Search Field");

        //submit the go button
        Reusable_Action.submitAction(driver,"//*[@name='btnK']","Google Search Button");

    }//end of test 1

    @Test(priority = 2)
    public void CaptureSearchNumber(){

        //capture search result
        String result = Reusable_Action.getTextAction(driver,"//*[@id='result-stats']","Search Result Text");

        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");

        System.out.println("Search number is " + arrayResult[1]);

    }//end of test 2

    @AfterTest
    public void quitSession(){
        driver.quit();
    }//end of after suite

}//End of Java Class
