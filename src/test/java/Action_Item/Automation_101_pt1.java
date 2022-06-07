package Action_Item;

import java.util.ArrayList;

public class Automation_101_pt1 {

    public static void main(String[] args){

        //Create an ArrayList for countries and iterate it with for Loop

        ArrayList <String> Countries = new ArrayList<>();

        //Add countries in ArrayList

        Countries.add("Pakistan");
        Countries.add("Turkey");
        Countries.add("Russia");
        Countries.add("USA");

        //Create an ArrayList for CountryCode

        ArrayList<Integer> CountryCode = new ArrayList<>();

        //Add CountryCode in ArrayLIst

        CountryCode.add(100);
        CountryCode.add(200);
        CountryCode.add(300);
        CountryCode.add(400);

        //using forLoop to declare the value

        for ( int i = 0 ; i < Countries.size();  i++) {
            System.out.println("My country is " + Countries.get(i) + " and my CountryCode is " + CountryCode.get(i));



        }//end of forLoop


    }//end of main method
}//end of java class
