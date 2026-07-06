
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String hi = scanner.nextLine();
            if(hi.equals("")){
                break;
            }
            String[] piece = hi.split(" ");
            System.out.println(piece[0]);
        }
        scanner.close();

    }
}
