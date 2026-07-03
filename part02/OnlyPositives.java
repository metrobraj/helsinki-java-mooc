
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while(true){
            System.out.println("Give a number:");
            x = scanner.nextInt();
            if(x>0){
                System.out.println(x*x);
            } else if(x==0){
                break;
            } else{
                System.out.println("Unsuitable number");
                continue;
            }
        }
    }
}
