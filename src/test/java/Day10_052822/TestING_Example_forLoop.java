package Day10_052822;


import ReusableLibrary.Reusable_Action;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;


    public class TestING_Example_forLoop {

        //declare the local driver outside so that it can be reusable with other annotation method
        WebDriver driver;

        //before suite will set the driver you are using

        @BeforeTest
        public void SetChromeDriver(){

            driver = Reusable_Action.setDriver();

        }//end of before suite annotation

        //test case 1: navigate to google and enter a keyword on search field

        @Test
        public void SearchForKeyword(){

            //create an array list for
            ArrayList<String> cars = new ArrayList<>();

            cars.add("BMW");
            cars.add("Mercedes");
            cars.add("Tesla");
            for (int i =0; i < cars.size(); i++) {

                driver.navigate().to("http:/www.google.com");

                //enter a keyword on search field
                Reusable_Action.sendKeysAction(driver,"//*[@name='q']",cars.get(i),"Search Field");

                //submit the go button
                Reusable_Action.submitAction(driver,"//*[@name='btnK']","Google Search Button");

                //capture search result
                String result = Reusable_Action.getTextAction(driver, "//*[@id='result-stats']", "Search Result Text");

                //split the result by single space and print out the search number
                String[] arrayResult = result.split(" ");

                System.out.println("Search number for " + cars.get(i) + "is" + arrayResult[1]);
            }//end of forLoop

        }//end of test 1



        @AfterTest
        public void quitSession(){

            driver.quit();
        }//end of after suite

    }//End of Java Class


