import java.util.Scanner;

public class QuartsToGallonsInteractive
{
    public static void main(String[] args){
        int numberOfQuartsInputed;
        int numberOfQuartsInAGallon = 4;
        int reminderOfQuarts;
        int numberOfGallons;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of quarts needed to do the job >>> ");
        numberOfQuartsInputed = keyboard.nextInt();

        numberOfGallons = numberOfQuartsInputed / numberOfQuartsInAGallon;
        reminderOfQuarts =  numberOfQuartsInputed % numberOfQuartsInAGallon;

        System.out.println("The number of gallons ordered is " + numberOfGallons +
                " and the number of quarts remaining is " + reminderOfQuarts);

    }
}
