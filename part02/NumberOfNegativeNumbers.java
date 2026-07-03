
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = 0;
        while(true){
            System.out.println("Give a number:");
            int b = scanner.nextInt();
            if(b==0){
                break;
            } else if(b<0){
                nn++;
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + nn);
    }
}
