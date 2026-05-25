public class TypeCasting {
    public static void main(String args[]){
        int a = 20;
        float pi = 3.14f;
        char grade = 'A';
        String name = "Shruti Johi";
        System.out.println("Integer value:" + a);
        System.out.println("Float value:" + pi);
        System.out.println("Character value:" + grade);
        System.out.println("String value:" + name);

        // (implicit) Type Casting
        int num1 = 10;
        float num2 = num1; // int to float
        System.out.println("Implicit Type Casting: " + num2);

        // (Explicit) Type Casting
        float num3 = 3.14f;
        int num4 = (int) num3; // float to int
        System.out.println("Explicit Type Casting: " + num4);
    }
}
