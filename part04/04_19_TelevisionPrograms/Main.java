import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, dur));
        }
        System.out.println();
        System.out.println("Program's maximum duration? ");
        int max = scanner.nextInt();
        for(TelevisionProgram prgm : programs){
            if(prgm.getDuration() <= max){
                System.out.println(prgm);
            }
        }

        scanner.close();

    }
}
