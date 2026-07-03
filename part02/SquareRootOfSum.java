
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = a+b;
        double sq = Math.sqrt(s);
        System.out.println(sq);
        
    }
}
