
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String num = scanner.nextLine();
            if(num.equals("end")){
                break;
            }
            int actnum = Integer.valueOf(num);
            int cube = actnum*actnum*actnum;
            System.out.println(cube);
        }
        scanner.close();

    }
}
