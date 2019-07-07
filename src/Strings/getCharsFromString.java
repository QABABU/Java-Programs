package Strings;

import java.util.Scanner;

public class getCharsFromString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        //reading input string
        String str = sc.nextLine();
        System.out.println("Given string: "+str);
        //finding string length
        int stringLength = str.length();

        for (int i=0; i<stringLength; i++){

            System.out.println("The character at index "+i+" is: "+str.charAt(i));

        }

    }
}
