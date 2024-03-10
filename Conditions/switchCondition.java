package Conditions;

import java.util.Scanner;

public class switchCondition {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number: ");
      int day = sc.nextInt();

      switch (day) {
         case 1:
            System.out.println("Monday, class");
            break;
         case 2:
            System.out.println("Tuesday, class hai yar");
            break;
         case 3:
            System.out.println("Wednesday, firse yar class");
            break;
         case 4:
            System.out.println("Thursday, aaj to bilkul man nahi hai class ka");
            break;
         case 5:
            System.out.println("Friday, No classss yeaaahh");
            break;
         case 6:
            System.out.println("Saturday, looooong weekend");
            break;
         case 7:
            System.out.println("Sunday, kal fir class hai yrrrr");
            break;
         default:
         System.out.println("Thinking about WEEKEND............");   
      }
      sc.close();
   }
}
