package Action_Item;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Automation_101_pt2_loopCondiotions {
    public static void main(String[] args){

        //Create an Array list for Cities and print only when that city is Brooklyn or Manhattan.
        ArrayList <String> Cities = new ArrayList<>();

                Cities.add("Brooklyn");
                Cities.add("Queens");
                Cities.add("Manhattan");
                Cities.add("StatenIsland");
                Cities.add("Bronx");

                //Using forLoop with Conditions
        for ( int i = 0; i < Cities.size(); i++){

            if (Cities.get(i) == "Brooklyn"){

                System.out.println("My city is Brooklyn");

            } else if (Cities.get(i) == "Manhattan"){

                System.out.println("My city is Manhattan");

            }//End of Conditions
        }//End of forLoop
    }//End of MainMethod
}//End of Java Class
