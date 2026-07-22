public class Book {
    private String title;
    private int page;
    private int year;
    public Book(String title, int page, int year){
        this.title = title;
        this.page = page;
        this.year = year;
    }
    public String title(){
        return this.title;
    }
    public int page(){
        return this.page;
    }
    public int year(){
        return this.year;
    }
}
