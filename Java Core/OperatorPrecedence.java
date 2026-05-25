public class OperatorPrecedence{
    public static void main(String args[]){
        int a = 10 + 5 * 2;
        int b = (20 + 5) * 2;
        int c = 20 + 5 * 2 - 3;
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        System.out.println("c: " +c);
    }
}