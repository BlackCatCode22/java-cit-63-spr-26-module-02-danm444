import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();

        compareTwoInts(num1, num2);

        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of the two integers is: " + sum);
    }

    // Method to get input
    public static int getAnIntFromTheUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    // Method to compare (void because it just prints)
    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    // Method to return a value
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
}