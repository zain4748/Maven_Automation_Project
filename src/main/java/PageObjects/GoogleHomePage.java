package PageObjects;

import ReusableClasses.Reusable_Actions_POM_Loggers;
import ReusableClasses.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class GoogleHomePage  extends Reusable_Annotation_Class {

    //Declare the extentTest for each page object class
    ExtentTest logger;

    //create a constructor method thet will reference the same name as your class, you can your
    //page object class method static when you call it in test class

    public GoogleHomePage(WebDriver driver){

        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class.logger;

    }//end of constructor

    //define all the WebElements using @Find by concept
    @FindBy(xpath = "//*[@name='q']")
    WebElement searchField;
    @FindBy(xpath = "//*[@name='btnK']")
    WebElement googleSearchButton;
    @FindBy(xpath = "//*[@name='links']")
    List<WebElement> listlinks;

    public void searchUserValue(String uservalue){
        Reusable_Actions_POM_Loggers.sendKeysAction(driver,searchField,uservalue,logger,"Search Field");

    }//end of search field method

    public void submitOnGoogleSearch(){
        Reusable_Actions_POM_Loggers.submitAction(driver,googleSearchButton,logger,"Google Search Button");

    }

}
