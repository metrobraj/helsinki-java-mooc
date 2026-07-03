
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int v = scan.nextInt();
        double tax;
        if(v<5000){
            System.out.println("No tax!");
        } else if(v>=5000 && v<25000){
            tax = 100+(v-5000)*0.08;
            System.out.println("Tax: " + tax);
        } else if(v>=25000 && v<55000){
            tax = 1700+(v-25000)*0.1;
            System.out.println("Tax: " + tax);
        } else if(v>=55000 && v<200000){
            tax = 4700+(v-55000)*0.12;
            System.out.println("Tax: " + tax);
        } else if(v>=200000 && v<1000000){
            tax = 22100+(v-200000)*0.15;
            System.out.println("Tax: " + tax);
        } else {
            tax = 142100+(v-1000000)*0.17;
            System.out.println("Tax: " + tax);
        }
    }
}
