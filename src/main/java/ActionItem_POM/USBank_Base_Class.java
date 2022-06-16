package ActionItem_POM;

import PageObjects.GoogleHomePage;
import ReusableClasses.Reusable_Annotation_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class USBank_Base_Class extends Reusable_Annotation_Class {
    public USBank_Base_Class(WebDriver driver){
        PageFactory.initElements(driver,this);

    }//end of constructor class

    //create static reference for google home page
    public static USBank_Home_Page USBankHomePage(){
        USBank_Home_Page USBankHomePage= new USBank_Home_Page(driver);
        return  USBankHomePage;

        }//end of USBank_Base_Class method

    public static USBank_CreditCard USBankCreditCard(){
        USBank_CreditCard USBankCreditCard = new USBank_CreditCard(driver);
        return USBankCreditCard;
    }//end of USBank_CreditCard

    public static USBank_Checking_Account USBankCheckingAccount(){
        USBank_Checking_Account USBankCheckingAccount = new USBank_Checking_Account(driver);
        return USBankCheckingAccount;
    }//end of USBankCheckingAccount

    public static USBank_VehicleLoan USBankVehicleLoan(){
        USBank_VehicleLoan USBankVehicleLoan = new USBank_VehicleLoan(driver);
        return USBankVehicleLoan;
    }//end of usbank vehicle loan base class

    public static USBank_HomeLoan USBankHomeLone(){
        USBank_HomeLoan USBankHomeLoan = new USBank_HomeLoan(driver);
        return USBankHomeLoan;
    }//end of home loan base class

}//end of class
