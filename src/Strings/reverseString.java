package Strings;

public class reverseString {

    public static void main(String[] args) {

        String reversed = reverse("qababu.com");

        System.out.println("The reversed string is: "+reversed);

    }

    private static String reverse(String str){

        String reverse="";

        char[] ch = str.toCharArray();

        for (char c: ch) {

            reverse = c + reverse;
        }

        return reverse;
    }
}
