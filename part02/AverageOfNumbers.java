
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int in = scanner.nextInt();
            if(in==0){
                break;
            }
            num++;
            sum += in;
        }
        double avg = (double)sum/num;
        System.out.println("Average of the numbers: " + avg);

    }
}
