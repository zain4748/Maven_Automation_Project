package Day12_060422;

import ReusableClasses.Reusable_Actions_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Google_Search_With_Reusable_Annotations extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void GoogleSearchForKeyword(){

        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
        Reusable_Actions_Loggers.sendKeysAction(driver,"//*[@name='q']","BMW",logger,"Search Field");
        //submit the go button
        Reusable_Actions_Loggers.submitAction(driver,"//*[@name='btnK']",logger,"Google Search Button");
    }//end of test 1

    @Test(dependsOnMethods = "GoogleSearchForKeyword")
    public void GoogleCaptureSearchNumber(){
        //capture search result
        String result = Reusable_Actions_Loggers.getTextAction(driver,"//*[@id='result-stats']",logger,"Search Result Text");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Search number is " + arrayResult[1]);
    }//end of test 2
}//end of class
