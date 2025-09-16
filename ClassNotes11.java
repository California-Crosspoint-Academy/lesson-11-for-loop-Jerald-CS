//Author Jerald Huang
//Date 2025-09-15

public class ClassNotes11 {
    public static void main(String[] args){
        int j = 0, sum = 0;
        for (j = 3; j <= 79; j++)
        {
        sum = sum + j;
        System.out.println(sum); //Show the progress as we iterate thru the loop.
        }
        System.out.println("The final sum is " + sum); // prints 3157

        for (int o = 0; o < 5; o++) {
            System.out.println("Outer loop"); // executes 5 times
                for (int k = 0; k < 8; k++) {
                    System.out.println("...Inner loop"); // executes 40 times
            }
        }


    }
}
