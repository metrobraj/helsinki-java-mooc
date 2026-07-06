
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String hi = scanner.nextLine();
            if(hi.equals("")){
                break;
            }
            String[] piece = hi.split(" ");
            for(int i=0;i<piece.length;i++){
                System.out.println(piece[i]);
            }
        }
        scanner.close();
    }
}
