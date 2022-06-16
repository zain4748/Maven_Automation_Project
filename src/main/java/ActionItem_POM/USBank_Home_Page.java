package ActionItem_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USBank_Home_Page extends Reusable_Annotation_Class {

    //Declare the extentTest for each page object class
    ExtentTest logger;

    //create a constructor method thet will reference the same name as your class, you can your
    //page object class method static when you call it in test class

    public USBank_Home_Page(WebDriver driver){

        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the WebElements using @Find by concept
    @FindBy(xpath = "//*[@id='navigation-menuitem-personal']")
    WebElement PerosnalTab;
    @FindBy(xpath = "//*[@id='navigation-menuitem-investing-and-retirement']")
    WebElement InvestmentAndRetirement;
    @FindBy(xpath = "//*[@href='/content/usbank/investing/investment-management.html']")
    WebElement InvestmentManagement;

    public void PerosnalTab(){
        Reusable_Actions_POM_Loggers.clickAction(driver,PerosnalTab,logger,"PersonalTab");
    }//end of peronal method

    public void InvestmentAndRetirement(){
        Reusable_Actions_POM_Loggers.clickAction(driver,InvestmentAndRetirement,logger,"InvestmentAndRetirement");
    }//end of Investment and retirement method

    public void InvestmentManagement(){
        Reusable_Actions_POM_Loggers.clickAction(driver,InvestmentManagement,logger,"InvestmentManagement");
    }//end of investment management method




}//end of java class
