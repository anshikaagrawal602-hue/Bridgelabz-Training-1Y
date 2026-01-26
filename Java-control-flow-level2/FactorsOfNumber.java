import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("not positive integer.");
        } else {
            // Find factors
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
