package Numerics;

import java.util.Scanner;
import java.util.regex.Pattern;

public class mobileNumStartingDigit  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 digit mobile number: ");
        //reading the input mobile number
        long mobile_num = sc.nextLong();

        System.out.println("Given mobile number: "+mobile_num);
        //converting Long to String type
        String s = Long.toString(mobile_num);

        String regEx = "^[789][0-9]{9}";
        //Matching regular expression with given mobile number
        boolean m = Pattern.matches(regEx,s);

        if(m){
            System.out.println("Given mobile number is valid");
        }else{
            System.out.println("Given mobile number is invalid");
        }
    }
}
