
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
            lines.add(sc.nextLine());
            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + "failed.");
        }
        int num=0;

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        for(int i =0;i<lines.size();i++){
            if(searchedFor.equals(lines.get(i))){
                System.out.println("Found!");
                break;
            } else if(num==lines.size()-1){
                System.out.println("Not found.");
            }
            num++;
        }
        scanner.close();
    }
}
