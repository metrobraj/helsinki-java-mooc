
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int num = 0;
        int ev = 0;
        int odd = 0;
        while(true){
            int n = scanner.nextInt();
            if(n==-1){
                System.out.println("Thx! Bye!");
                break;
            }
            if(n%2==0){
                ev++;
            } else {
                odd++;
            }
            sum += n;
            num++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num);
        double avg = (double)sum/num;
        System.out.println("Average: " + avg);
        System.out.println("Even: " + ev);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}
