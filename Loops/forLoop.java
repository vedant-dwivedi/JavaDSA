package Loops;

public class forLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println(i + " This will print the nos till 9 ");

            // Nested Loop 
            for (int j = 0; j < 69; j = j + 2) {
                System.out.println(j + " is the Even nos between 0 and 69");  // phle ek i print hoga fir poora j run hoga, fir next i run hoga fir poora j ese nested work krega  
            }
        }
    }
}
