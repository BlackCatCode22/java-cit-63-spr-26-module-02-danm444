public static void main(String[] args) {
    // Change 'those' to 'in'
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string to reverse: ");
    String original = input.nextLine();

    String reversed = "";

    for (int i = original.length() - 1; i >= 0; i--) {
        reversed += original.charAt(i);
    }

    System.out.println("Reversed: " + reversed);
}