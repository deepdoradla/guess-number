import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by deepdoradla on 10/03/2016.
 */
public class GuessNumber {

    public GuessNumber() {

    }

    public static void main(String[] args)
    {
        System.out.println("Consider a number between 1 to 20");


        int min = 1;
        int max = 20;

        guess(min, max);
    }

    public static void guess(int min, int max)
    {

        int median = (min+max)/2;
        Scanner scanner = new Scanner(System.in);
        int answer = 1;
        System.out.println("Is the number less than " + median + "? Answer 1 if yes and 0 if no : ");

        try{
             answer = scanner.nextInt();
        }catch(InputMismatchException e)
        {
            e.printStackTrace();
        }


        if(answer == 1)
        {
            //If number is less than median
            max = median - 1;
            guess(min,max);
        }else if(answer == 0)
        {
            if(min == max)
                System.out.println("Your number is " + max);
            else
            {
                min = median + 1; //If number is greater than median
                guess(min,max);
            }


        }

    }

}
