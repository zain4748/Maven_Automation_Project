package Action_Item;

import ReusableLibrary.Reusable_A101;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class UHC_Reusable_A101 {
    public static void main(String[] args) {


        //setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_A101.setDriver();

        //Create an array list for first name
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Zain");
        firstName.add("Asfand");
        firstName.add("Ibraheem");

        //Create an array list for last name
        ArrayList<String> LastName = new ArrayList<>();
        LastName.add("Ali");
        LastName.add("Yar");
        LastName.add("Akbar");

        //Create an array list for birth month
        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("May");
        birthMonth.add("April");
        birthMonth.add("June");

        //Create an array list for birthday
        ArrayList<String> birthday = new ArrayList<>();
        birthday.add("10");
        birthday.add("9");
        birthday.add("11");

        //Create an array list for birth year
        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("2000");
        birthYear.add("2002");
        birthYear.add("1998");

        ////Create an array list for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("20100");
        zipCode.add("20012");
        zipCode.add("19198");

        //Create an array list for member id
        ArrayList<String> memberId = new ArrayList<>();
        memberId.add("20238");
        memberId.add("20302");
        memberId.add("19908");

        //start for loop
        for (int i = 0; i < firstName.size(); i++) {
            //navigate to usps
            driver.navigate().to("https://www.uhc.com");
            //verify the tiltle of the website
            Reusable_A101.verifyTitle(driver, "Health insurance plan");


            //click on find a doctor
            Reusable_A101.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor");

            //click on sign in
            Reusable_A101.clickAction(driver, "//*[@aria-label='Sign in menu']", "Sign in");

            //click on Medicare plan

            Reusable_A101.clickAction(driver, "//*[@ aria-label='Medicare plan? Sign in to Medicare member site Opens a new window']", "Medicare plan?");

            Reusable_A101.switchToTabByIndex(driver, 1);
            //click on register now
            Reusable_A101.clickAction(driver, "//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Register Now");
            //type the first name
            Reusable_A101.sendKeysAction(driver,"//*[@id='firstName']",firstName.get(i),"First Name");
            //type the Last name
            Reusable_A101.sendKeysAction(driver,"//*[@id='lastName']",LastName.get(i),"Last Name");
            //type the month
            Reusable_A101.selectByText(driver,"//*[@name='dob_month']",birthMonth.get(i),"Month dropdown");
            //type the day
            Reusable_A101.sendKeysAction(driver,"//*[@id='dob_day']",birthday.get(i),"Day");
            //type the year
            Reusable_A101.sendKeysAction(driver,"//*[@id='dob_year']",birthYear.get(i),"Year");
            //type the zipcode
            Reusable_A101.sendKeysAction(driver,"//*[@id='zipCode']",zipCode.get(i),"Zipcode");
            //type the member id
            Reusable_A101.sendKeysAction(driver,"//*[@id='memberId']",memberId.get(i),"MemberId");
            //click on continue
            Reusable_A101.clickAction(driver, "//*[@id='submitBtn']", "Continue");

            //print out header text info
            String result = Reusable_A101.getTextAction(driver,"//*[@class='SummaryError_ErrorIcon__2tOzq']","Error code");
            System.out.println("My Error code " + result);

            //close the driver
            driver.close();
            Reusable_A101.switchToTabByIndex(driver,0);

        }//end of for loop
        //quit the driver
        driver.quit();

    }//end of java class
}//end of main