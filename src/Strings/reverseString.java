package Strings;

import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //reading input string
        String inputString = scanner.next();

        scanner.close();

        String reversed = reverse(inputString);

        System.out.println("The reversed string is: "+reversed);

    }

    //method to reverse given string
    private static String reverse(String str){
        String reverse="";
        //converting given string character array
        char[] ch = str.toCharArray();
        for (char c: ch) {
            //adding each character to reverse variable in reversed order
            reverse = c + reverse;
        }

        return reverse;
    }
}
