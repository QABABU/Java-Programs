package Strings;

import java.util.*;

public class duplicateCharRepeated {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        //reading the input string
        String str = scanner.nextLine();

        duplicateChars(str);

    }

    public static void duplicateChars(String str){

        HashMap<Character, Integer> hashMap = new HashMap<>();
        //converting the given string to char array
        char[] chars = str.toCharArray();

        for (Character ch:chars){
            //checking if the character present in the hashMap
            if(hashMap.containsKey(ch)){
                //if yes, increase the key value by 1
                hashMap.put(ch, hashMap.get(ch)+1);
            }else {
                //else, just put the character with value 1
                hashMap.put(ch,1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet= hashMap.entrySet();

        for(Map.Entry<Character,Integer> entry: entrySet){

            if(entry.getValue()>=2){

                System.out.println("The character "+entry.getKey()+" is repeated for "+entry.getValue());
            }

        }
    }
}
