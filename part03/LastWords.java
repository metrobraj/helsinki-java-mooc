
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String hi = scanner.nextLine();
            if(hi.equals("")){
                break;
            }
            String[] piece = hi.split(" ");
            System.out.println(piece[piece.length-1]);
        }
        scanner.close();


    }
}
