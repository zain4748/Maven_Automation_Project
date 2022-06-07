package Day3_043022;

import ReusableLibrary.ReusableMethod;

public class TestingMethod {
    public static void main(String[] args){

        //call the add two number method and execute it

       // ReusableMethod.addTwoNumbers(20,30);

       //call the return method and store it in a variable to perform something else
       int finalResult = ReusableMethod.subtractTwoNumbers(50,10) ;
       int newResult = finalResult + 69;
       System.out.println("new result is " + newResult);

    }//end of the main method

}//end of java class
