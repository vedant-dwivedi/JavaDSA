package Basics1;

public class assignmentOperator {
    public static void main(String[] args) {
        int x = 6;
        x += 1;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        x %= 2;
        System.out.println(x);
        x &= 2; // Logical AND
        System.out.println(x);
        x |= 2; // Logical OR
        System.out.println(x);
        x ^= 2; // Bitwise exclusive OR
        System.out.println(x);
        x >>= 2; // Right Shift
        System.out.println(x);
        x <<= 2; // Left Shift
        System.out.println(x);
        int y = 10;
        int z = 3;
        System.out.println(y>>z);
    }
}