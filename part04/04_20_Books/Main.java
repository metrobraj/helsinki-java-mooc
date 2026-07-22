import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        //scanner and array created
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while(true){
            System.out.println("Title: ");
            String title = sc.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int page = Integer.valueOf(sc.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(sc.nextLine());
            list.add(new Book(title, page, year));
        }
        System.out.println("What information will be printed? ");
        String req = sc.nextLine();
        if(req.equals("everything")){
            for(Book info : list){
                System.out.println(info.title() + ", " + info.page() + " pages, " + info.year());
            }
         } else if(req.equals("name")){
            for(Book info : list){
                System.out.println(info.title());
            }
        }
        sc.close();
    }

}

