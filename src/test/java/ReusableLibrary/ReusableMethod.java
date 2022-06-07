package ReusableLibrary;

import javax.xml.transform.Result;

public class ReusableMethod {

    //create a void method to add two numbers

    public static void addTwoNumbers(int num1, int num2){
        int result = num1+num2;
        System.out.println("The result of two number is " + result);


    }//end of add two number method

    //create a return integer method to subtract two number
    public static int subtractTwoNumbers (int a, int b){
        int result = a - b;
        System.out.println("The result of two number for subtraction is " + result);

        return result;

        }//end of subtract return method


}
