import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String string = sc.nextLine();
        StringBuilder sb = new  StringBuilder();
        String reverse = sb.append(string).reverse().toString();
        System.err.println("reverse string is: " + reverse);
    }
}
