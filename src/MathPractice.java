import java.util.Scanner;

public class MathPractice
{
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        num1 = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number>>>>>");
        num2 = input.nextInt();
        System.out.println("Please enter another whole number>>>>>");
        num1 = input.nextInt();


        num3 = num1 + num2;
        System.out.println(num3);
        num3 = num1 * num2;
        System.out.println(num3);
        num3 = num2 / num1;
        System.out.println(num3);
        num3 = num2 % num1;
        System.out.println(num3);
        num3 = num2 - num1;
        System.out.println(num3);






    }
}