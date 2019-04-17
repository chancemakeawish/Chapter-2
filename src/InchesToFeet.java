import java.util.Scanner;

public class InchesToFeet
{
    public static void main(String[] args)
    {
        int numberOfInchesInputed;
        int numberOfInchesInAFeets = 4;
        int reminderOfInches;
        int numberOfFeet;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of inches needed to do the job >>> ");
        numberOfInchesInputed = keyboard.nextInt();

        numberOfFeet = numberOfInchesInputed / numberOfInchesInAFeets;
        reminderOfInches =  numberOfInchesInputed % numberOfInchesInAFeets;

        System.out.println("The number of feet ordered is " + numberOfFeet +
                " and the number of inches remaining is " + reminderOfInches);


    }

}
