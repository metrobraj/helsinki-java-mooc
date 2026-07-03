
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        boolean v = number1>number2;
        if(v==true){
            return number2;
        } else {
            return number1;
        }
        // don't print anything inside this method
        // there must be a return in the end of the method
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
