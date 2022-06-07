package Action_Item;

public class Automation_101_pt1_if_else {
    public static void main(String[] args){
        String myVariable;
        myVariable = "What is my Grade?";
        System.out.println("What is my Grade?");

        //Declare value for the grade

        int grade = 59;
        if ( grade >= 90 && grade <=100){
            System.out.println("Grade is A");
        } else if ( grade >= 80 && grade <=90){
            System.out.println("Grade is B");
        } else if ( grade >= 70 && grade <=80){
            System.out.println("Grade is C");
        }else if ( grade >= 60 && grade <=70){
            System.out.println("Grade is C");
        }else if ( grade < 60){
            System.out.println("Grade is F");
        }// end of conditions
    }//end of main method
}//end of java class