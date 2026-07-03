
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int y = scan.nextInt();
        if(y%4!=0) {
            System.out.println("The year is not a leap year.");
        } else if(y%4==0 && y%100!=0){
            System.out.println("This year is a leap year.");
        } else if(y%100==0 && y%400==0){
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
        scan.close();


    }
}
