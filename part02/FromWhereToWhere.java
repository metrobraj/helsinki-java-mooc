
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int t = scanner.nextInt();
        System.out.println("Where from?");
        int f = scanner.nextInt();
        for(int i = f; i<=t; i++){
            System.out.println(i);
        }
    }
}
