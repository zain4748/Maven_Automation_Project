package ActionItem_POM;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static ReusableClasses.Reusable_Annotation_Class.driver;

public class USBank_Checking_Account extends Reusable_Annotation_Class{

    //Declare the extentTest for each page object class
    ExtentTest logger;

    //create a constructor method thet will reference the same name as your class, you can your
    //page object class method static when you call it in test class

    public USBank_Checking_Account(WebDriver driver) {

        //page factory function for page object
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    @FindBy(xpath = "//*[@id='navigation-menuitem-bank-accounts']")
    WebElement BankAccount;
    @FindBy(xpath = "//*[@href='/bank-accounts/checking-accounts.html']")
    WebElement CheckingAccount;

    public void BankAccount(){
        Reusable_Actions_POM_Loggers.clickAction(driver,BankAccount,logger,"Bank Account");
    }//end of Bank Account Method

    public void CheckingAccount(){
        Reusable_Actions_POM_Loggers.clickAction(driver,CheckingAccount,logger,"Checking Account");
    }//end of Checking Account

}//end of java class
