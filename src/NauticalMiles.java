import java.util.Scanner;

public class NauticalMiles
{
    public static void main(String[] args)
    {
        int numberOfKilometersInputed;
        int numberOfKilometersInAMiles = 4;
        int reminderOfKilometers;
        int numberOfMiles;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of kilometers needed to do the job >>> ");
        numberOfKilometersInputed = keyboard.nextInt();

        numberOfMiles = numberOfKilometersInputed / numberOfKilometersInAMiles;
        reminderOfKilometers =  numberOfKilometersInputed % numberOfKilometersInAMiles;

        System.out.println("The number of miles ordered is " + numberOfMiles +
                " and the number of kilometers remaining is " + reminderOfKilometers);


    }
}
