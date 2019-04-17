import java.util.Scanner;

class IntegerDemoInteractiveWithName
{
    public static void main(String[] args)
    {
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;


        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte Integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short Integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long Integer >> ");
        aLong = input.nextLong();

        String name;
        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        System.out.print("Thank you, " + name);
        input.nextLine();


    }
}
