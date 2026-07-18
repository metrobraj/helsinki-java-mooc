
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        Statistics statistics = new Statistics();
        Statistics evensum = new Statistics();
        Statistics oddsum = new Statistics();
        System.out.println("Enter numbers:");
        while(true){
            int i = scanner.nextInt();
            if(i==-1){
                break;
            }
            statistics.addNumber(i);
            if(i%2==0){
                evensum.addNumber(i);
            } else{
                oddsum.addNumber(i);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evensum.sum());
        System.out.println("Sum of odd numbers:  " + oddsum.sum());

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        scanner.close();
    }
}
