package Day4_050722;

public class SplitMessage {
    public static void main(String[] args) {
        //declare string variable
        String splitMessage = "My name Is John";
        //declare an array of string to store the string split
        String[] splitMessageArray = splitMessage.split(" ");

        //print out John to the console
        System.out.println("My first name is " + splitMessageArray[3]);
    }//end of main method
}//end of java class