
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name: ");
            String fnm = scanner.nextLine();
            if(fnm.equals("")){
                break;
            }
            System.out.println("Last name: ");
            String lnm = scanner.nextLine();
            System.out.println("Identification number: ");
            String idno = String.valueOf(scanner.nextLine());
            infoCollection.add(new PersonalInformation(fnm, lnm, idno));
        }
        System.out.println();
        for(PersonalInformation persinfo : infoCollection){
            System.out.println(persinfo.getFirstName() + " " + persinfo.getLastName());
        }
        scanner.close();
    }
}
