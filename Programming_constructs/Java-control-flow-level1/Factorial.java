import java.util.*;
class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int fact = 1;

        if (a < 0) {
            System.out.println("Factorial not defined!");
        }
        else if (a == 0) {
            System.out.println("Factorial is 1");
        }
        else {
			int i=1;
            while (i <= a) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial is " + fact);
        }
    }
}