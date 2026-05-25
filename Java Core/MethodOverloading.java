public class MethodOverloading{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int sum1 = add(5,10);
        double sum2 = add(10000.0,20000.0);
        int sum3 = add(5,10,50);
    
    System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}