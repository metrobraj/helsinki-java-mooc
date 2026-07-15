public class Product {
    private double price;
    private int quan;
    private String name;
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice;
        this.quan = initialQuantity;
        this.name = initialName;
    }
    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quan + " pcs");
    }
}
