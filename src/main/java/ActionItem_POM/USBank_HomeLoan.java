package ActionItem_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class USBank_HomeLoan extends Reusable_Annotation_Class {


    //Declare the extentTest for each page object class
    ExtentTest logger;

    //create a constructor method thet will reference the same name as your class, you can your
    //page object class method static when you call it in test class

    public USBank_HomeLoan(WebDriver driver){

        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    @FindBy(xpath = "//*[@id='navigation-menuitem-home-loans']")
    WebElement HomeLoan;
    @FindBy(xpath = "//*[@href='/home-loans/home-equity.html']")
    WebElement HomeEquity;
    @FindBy(xpath = "//*[@aria-label='Apply for a U.S. Bank Home equity loan']")
    WebElement ApplyNow;
    @FindBy(xpath = "//*[@class='form-control zipInputField']")
    WebElement Zipcode;
    @FindBy(xpath = "//*[@id='executeZipEligibilityButton']")
    WebElement GoButton;

    public void HomeLoan(){
        Reusable_Actions_POM_Loggers.clickAction(driver,HomeLoan,logger,"Home Loan");
    }//end of home loan method

    public void HomeEquity(){
        Reusable_Actions_POM_Loggers.clickAction(driver,HomeEquity,logger,"Home Equity");
    }//end of home equity method

    public void ApplyNow(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ApplyNow,logger,"Apply Now");
    }//end of Apply now method

    public void Zipcode() {
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        for (int i = 0; i < zipCode.size(); i++) {
            Reusable_Actions_POM_Loggers.sendKeysAction(driver, Zipcode, zipCode.get(i), logger, "Zipcode");
        }//end of loop
    }//end of zipcode method

    public void GoButton(){
        Reusable_Actions_POM_Loggers.submitAction(driver,GoButton,logger,"GO Button");
    }//end of go method

}//end of java class
