
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                list.add(sc.nextLine());
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        int num = 0;
        for(int i =0;i<list.size();i++){
            if(Integer.valueOf(list.get(i))<= upperBound && Integer.valueOf(list.get(i))>=lowerBound){
                num++;
            }
        }
        System.out.println("Numbers: " + num);
        scanner.close();
    }

}
