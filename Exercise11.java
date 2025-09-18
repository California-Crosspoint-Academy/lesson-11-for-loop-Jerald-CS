//Author Jerald Huang
//Date 2025-09-15

public class Exercise11{
    public static void main(String[] args) {
        //question 1
        //prints 5 because g is added 5 times and to make the 5 < 5 not true to stop the loop this in the end prints 5 because it does J++ 5 times making J 5

        //question 2
        //does 1 + 3 then saves that vale to s and then does 4 + 2 saves the new value to x this goes till j is 0 and the end s becomes 7 so it prints 7

        //question 3
        //the value of j keeps going up till the statement is made flase and that is the value of j in this case when j becomes 6 it is made false. So now j is plugged in into the equation and 56 is printed out 
    
        //question 4
        //it just prints 9 because the loop adds 1 till j < 9 so it keeps going till j = 9 and in the end just prints the value j which is 9

        //question 5
        //so it continuses the loop till it hits 10 which doesnt work in the loop so it just uses the previose working value 9 so does 19 + 9 = 28 and sets b to 28 and prints 28

        //question 6
        //it is just gonna print 101.01 because the d++  isnt in the loop and just does d++ one time meaning it only adds 1 to the value of d once

        //question 7
        int j;
        for (j = 3; j <= 24; j *= 2){
            System.out.println(j);
        }

        //question 8
        int d;
        for (d = 24; d >= 3; d /= 2)
        {
            System.out.println(d);
        }

        //question 9
        //runs the loop 5 times and adds 1 to k 5 times making k = 5 and after the 6 run j == 5 breaking the code and prints the value of k which is 5

        //question 10
        //condition
        
        //question 11
        // j becomes 5 10 15 20 all the way to 50 this is because it takes the value of i and divides it by 2 which cause the value of j to incroment by 5

        //question 12
        //the value of j will will only go up to 8 before breaking and plugging in 8 to the equation 2 times 8 which meakes r = 16 if printed

        //question 13
        //making a function that can never become false 

        //question 14
        //It can run 137 times becase p starts at 9 and adds 1 everytime so just do 145 - 9 + 1 which is 137 so the loop should run 137 times 

        //MCQ 
        //question 1
        //A (10) just like uh do the math

        //question 2
        //C (101) because it goes all the way to 100 and then goes up 1 more because it is < = to meaning it goes up one more time 
        
        //question 3
        //E (None of these) becausae 10.0 becuase p is a double if p was not a double it would be A (10)
        
        //question 4
        //B because it starts at a odd number 1 and adds 2 which means it stays at a odd number till 9 becausae it cant be grader than 10
        
        //question 5
        //D it is an endless loop because it adds 1 then subracts 1 which keeps it on the same number making it an inf loop
        
        //question 6
        //A because that how math works idk how to explain without explaining what simple math is 
        
        //question 7
        //D becase count = 40 and then in the print it does count-- so the value of count is 39 and since first print is print then it prints on the same line 4039 

    }
}