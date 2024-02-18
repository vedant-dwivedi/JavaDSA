package StringsBasics;

public class strings { 
   public static void main(String[] args) {
      String str = "Vedant Dwivedi"; // syntax 
        System.out.println("The name is " + str); 
        System.out.println("The length of the string is " + str.length()); // it shows the length of the string
        System.out.println("string in Upper Case " + str.toUpperCase()); // it converts all the letters in Upper Case 
        System.out.println("string in Lower Case " + str.toLowerCase()); // it converts all the letters in Lower Case
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf("Dwivedi"));
   }
}