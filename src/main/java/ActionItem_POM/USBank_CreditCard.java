package ActionItem_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USBank_CreditCard extends Reusable_Annotation_Class {

    //Declare the extentTest for each page object class
    ExtentTest logger;

    //create a constructor method thet will reference the same name as your class, you can your
    //page object class method static when you call it in test class

    public USBank_CreditCard(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //So put the variable for all the xpath that represent Credit Card Options or Tab

    @FindBy(xpath = "//*[@id='navigation-menuitem-personal']")
    WebElement PerosnalTab;
    @FindBy(xpath = "//*[@id='navigation-menuitem-credit-cards']")
    WebElement CreditCard;
    @FindBy(xpath = "//*[@href='/credit-cards.html']")
    WebElement ViewCreditCard;
    @FindBy(xpath = "//*[@href='https://applications.usbank.com/oad/begin?locationCode=8069&sourceCode=37913&offerId=7961492XPV']")
    WebElement ApplyNow;
    @FindBy(xpath = "//*[@id='securedCardOnline']")
    WebElement GetStarted;

    public void PerosnalTab(){
        Reusable_Actions_POM_Loggers.clickAction(driver,PerosnalTab,logger,"PersonalTab");
    }//end of personal method

    public void CreditCard(){
        Reusable_Actions_POM_Loggers.clickAction(driver,CreditCard,logger,"Credit Card");
    }//end of credit card tab method

    public void ViewCreditCard(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ViewCreditCard,logger,"View Credit Card");
    }//end of View Credit Card Options

    public void ApplyNow(){
        Reusable_Actions_POM_Loggers.clickAction(driver,ApplyNow,logger,"Apply Now");
    }//end of Apply Now Method

    public void GetStarted(){
        Reusable_Actions_POM_Loggers.clickAction(driver,GetStarted,logger,"Get Started");
    }//end of Get Started Method

}//end of class
