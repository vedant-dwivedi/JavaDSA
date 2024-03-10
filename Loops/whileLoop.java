package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value enter cro");
        int i = sc.nextInt();
        while (i < 9) {
            System.out.println((i) + ". " + "This is Known as Number Nine hehehe");
            i++;
        }
        sc.close();
    }
}