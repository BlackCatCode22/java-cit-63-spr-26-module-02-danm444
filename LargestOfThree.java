import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int n3 = input.nextInt();

        if (n1 >= n2) {
            if (n1 >= n3) {
                System.out.println("The largest number is: " + n1);
            } else {
                System.out.println("The largest number is: " + n3);
            }
        } else {
            if (n2 >= n3) {
                System.out.println("The largest number is: " + n2);
            } else {
                System.out.println("The largest number is: " + n3);
            }
        }
    }
}