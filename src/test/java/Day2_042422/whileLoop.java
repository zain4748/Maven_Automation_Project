package Day2_042422;

public class whileLoop {
    public static void main(String[] args){
        //iterate through zipcode using linear array and while looop
        String[] zipcode = new String[]{"11218","11219","11232","10001"};
        int[] houseNumber = new int[]{111,222,333,444};

        //initialize your starting point before calling while loop
        int i = 0;
        //define the end point in while loop
        while (i < houseNumber.length){
            System.out.println("My zipcode is " + zipcode[i] + " and my house number is " + houseNumber[i]);

            //incrementing
            i++;
        }//end of while loop
    }//end of main
}//end of java class

