
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = 0;
        while(true){
            System.out.println("Give a number:");
            int s = scanner.nextInt();
            if(s==0){
                break;
            }
            no++;
        }
        System.out.println("Number of numbers: " + no);
    }
}
