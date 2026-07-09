
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        //scanner object created
        Scanner sc = new Scanner(System.in);
        //lets create our variables for finding the average
        int sum=0;
        int num=0;
        int max = 0;
        String lon = "";
        //a while loop created for looping input
        while(true){
            String in = sc.nextLine();
            //first we check if the string is empty
            if(in.equals("")){
                break;
            }
            //we can split the in string now to retrieve the name and birth years separately
            String[] parts = in.split(",");
            int length = parts[0].length();
            sum += Integer.valueOf(parts[1]);
            if(length>max){
                lon = parts[0];
            }
            //we can now set max's value to the current length of parts[0] for comparing in the next loop
            max=lon.length();
            num++;
        }
        //we can create the avg variable for average, and the longest name can be printed using lon
        double avg = (double)sum/num;
        System.out.println("Longest name: " + lon);
        System.out.println("Average of the birth years: " + avg);
        sc.close();
    }
}
