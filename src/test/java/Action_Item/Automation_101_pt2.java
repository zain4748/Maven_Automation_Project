package Action_Item;

public class Automation_101_pt2 {
    public static void main(String[] args){

        //Create a String Array for Region

        String[] Region = new String[]{"North America", "Asia","MiddleEast","Europe"};

        //Create an integer Array for AreaCode

        int[] AreaCode = new int[]{11218,75643,23654,54637};

        int i = 0;

        //Define the end point in whileLoop

        while (i < AreaCode.length) {
            System.out.println("My region is " + Region[i] + " and my area code is " + AreaCode[i]);

            //incrementing
            i++;
        }

    }
}
