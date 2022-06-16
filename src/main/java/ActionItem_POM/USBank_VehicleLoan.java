package ActionItem_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USBank_VehicleLoan extends Reusable_Annotation_Class {

    //Declare the extentTest for each page object class
    ExtentTest logger;

    //create a constructor method thet will reference the same name as your class, you can your
    //page object class method static when you call it in test class

    public USBank_VehicleLoan(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    @FindBy(xpath = "//*[@id='navigation-menuitem-vehicle-loans']")
    WebElement VehicleLoan;
    @FindBy(xpath = "//*[@href='/content/usbank/vehicle-loans/auto-loans.html']")
    WebElement AutoLoan;
    @FindBy(xpath = "//*[@aria-label='Apply now for a U.S. Bank new car loan']")
    WebElement ApplyNow;

    public void VehicleLoan(){
        Reusable_Actions_POM_Loggers.clickAction(driver,VehicleLoan,logger,"Vehicle Loan");
    }//end of Vehicle Loan method

    public void AutoLoan(){
        Reusable_Actions_POM_Loggers.clickAction(driver,AutoLoan,logger,"Auto Loan");
    }//end of auto loan method

    public void ApplyNow(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ApplyNow,logger,"Apply Now");
    }//end of Apply now method



}//end of java class
