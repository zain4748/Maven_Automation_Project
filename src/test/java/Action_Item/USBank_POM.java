package Action_Item;

import ActionItem_POM.USBank_Base_Class;
import ReusableClasses.Reusable_Annotation_Class;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class USBank_POM extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void PersonalTab(){
        driver.navigate().to("https://www.usbank.com/index.html");
        USBank_Base_Class.USBankHomePage().PerosnalTab();
        USBank_Base_Class.USBankHomePage().InvestmentAndRetirement();
        USBank_Base_Class.USBankHomePage().InvestmentManagement();

    }//end of personal Tab and other Tabs

    @Test(priority = 2)
    public void CreditCard(){
        driver.navigate().to("https://www.usbank.com/index.html");
        USBank_Base_Class.USBankHomePage().PerosnalTab();
        USBank_Base_Class.USBankCreditCard().CreditCard();
        USBank_Base_Class.USBankCreditCard().ViewCreditCard();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,3500)");
        USBank_Base_Class.USBankCreditCard().ApplyNow();
        USBank_Base_Class.USBankCreditCard().GetStarted();

    }//end of CreditCard Apply Now

    @Test(priority = 3)
    public void USBank_Checking_Account(){
        driver.navigate().to("https://www.usbank.com/index.html");
        USBank_Base_Class.USBankHomePage().PerosnalTab();
        USBank_Base_Class.USBankCheckingAccount().BankAccount();
        USBank_Base_Class.USBankCheckingAccount().CheckingAccount();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,400)");

    }//end of Checking Account

    @Test(priority = 4)
    public void USBank_VehicleLoan(){
        driver.navigate().to("https://www.usbank.com/index.html");
        USBank_Base_Class.USBankHomePage().PerosnalTab();
        USBank_Base_Class.USBankVehicleLoan().VehicleLoan();
        USBank_Base_Class.USBankVehicleLoan().AutoLoan();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,600)");
        USBank_Base_Class.USBankVehicleLoan().ApplyNow();
    }//end of USBankVehicleLoan

    @Test(priority = 5)
    public void USBank_HomeLoan(){
        driver.navigate().to("https://www.usbank.com/index.html");
        USBank_Base_Class.USBankHomePage().PerosnalTab();
        USBank_Base_Class.USBankHomeLone().HomeLoan();
        USBank_Base_Class.USBankHomeLone().HomeEquity();
        USBank_Base_Class.USBankHomeLone().ApplyNow();
        USBank_Base_Class.USBankHomeLone().Zipcode();
        USBank_Base_Class.USBankHomeLone().GoButton();

    }//end of home loan for us bank





}//end of class
