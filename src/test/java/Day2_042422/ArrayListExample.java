package Day2_042422;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");

        //I want to print 4th value from the list
        System.out.println("My last country is " + countries.get(4) + " and my third country is " + countries.get(3));

    }
}
