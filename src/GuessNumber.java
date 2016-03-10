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
        System.out.println("Max and min values are : " + min + " : " + max);
        int median = (min+max)/2;
        Scanner scanner = new Scanner(System.in);
        int answer = 1;
        System.out.println("Is this your number? " + median + ". Answer 2 if yes. If greater than " + median + "? then answer 1 and 0 if less than  : ");

        try{
             answer = scanner.nextInt();
        }catch(InputMismatchException e)
        {
            e.printStackTrace();
        }


        if(answer == 1)
        {

            min = median; //If number is greater than median
            guess(min,max);

        }else if(answer == 0)
        {
            //If number is less than median
            max = median;
            guess(min,max);

        }else {
            System.out.println("Your number is " + median);
        }

    }

}
