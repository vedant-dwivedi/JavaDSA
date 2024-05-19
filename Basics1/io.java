package Basics1;

import java.util.*;

public class io {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values: ");
        int n = sc.nextInt();
        sc.close();
        if (n >9) {
            System.out.println("9 se jyada hai");
        }
        else{
            System.out.println("9 se kam hai");
        }

    }
}

