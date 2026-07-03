
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        int sum = a+b;
        int dif = a-b;
        int mult = a*b;
        double div = (double)a/b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + dif);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
        scanner.close();

    }
}
