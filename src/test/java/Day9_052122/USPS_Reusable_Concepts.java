package Day9_052122;

import ReusableLibrary.Reusable_Action;
import org.openqa.selenium.WebDriver;

public class USPS_Reusable_Concepts {
    public static void main(String[] args) {

        WebDriver driver = Reusable_Action.setDriver();

        driver.navigate().to("http://www.usps.com");

        Reusable_Action.mouseHover(driver,"//*[text()='Quick Tools']","Quick Tool");

        Reusable_Action.mouseHover(driver,"//*[@id='mail-width']","Send Tab");
        //click on calculate a price
        Reusable_Action.clickAction(driver,"//*[@class='tool-calc']", "Calculate a Price");
        //Enter the zipcode
        Reusable_Action.sendKeysAction(driver,"//*[@id='Drigin']","11218","Zip Code");


    }//end of main

}//end of java
