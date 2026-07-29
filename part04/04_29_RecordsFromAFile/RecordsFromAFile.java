
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                list.add(sc.nextLine());
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        for(int i =0;i<list.size();i++){
            String[] parts = list.get(i).split(",");
            System.out.println(parts[0] + ", age: " + parts[1] + " years");
        }
        scanner.close();
    }
}
