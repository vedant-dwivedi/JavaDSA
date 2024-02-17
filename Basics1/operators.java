package Basics1;

public class operators {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 3;
        System.out.println("sum: " + num1 + num2);
        System.out.println(num1 - num2);
        System.out.println("multiply: " + num1*num2);
        System.out.println("division: " + num1/num2); // tells the division
        System.out.println("modulus: " + num1%num2); // tells the remainder
        System.out.println("preinc: " + ++num1); 
        System.out.println("postinc: " + num2++);
        System.out.println("postdec: " + num2--);
        System.out.println("predec: " + --num2);
    }
}