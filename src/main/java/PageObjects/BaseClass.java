package PageObjects;

import ReusableClasses.Reusable_Annotation_Class;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotation_Class {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class.logger;
    }
}
