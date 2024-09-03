package leetcode75.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReverseVowels345 {

    public static String reverseVowels(String s ) {
        Map<Character, Integer> vowelMap = new HashMap<>();
        vowelMap.put('a', 0);
        vowelMap.put('e', 0);
        vowelMap.put('i', 0);
        vowelMap.put('o', 0);
        vowelMap.put('u', 0);
        vowelMap.put('A', 0);
        vowelMap.put('E', 0);
        vowelMap.put('I', 0);
        vowelMap.put('O', 0);
        vowelMap.put('U', 0);
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (!vowelMap.containsKey(charArray[right])) {
                right--;
            } else if (!vowelMap.containsKey(charArray[left])) {
                left++;
            } else if ( vowelMap.containsKey(charArray[right]) && vowelMap.containsKey(charArray[left]) ) {
                char temp = charArray[right];
                charArray[right] = charArray[left];
                charArray[left] = temp;
                right--;
                left++;
            } else {
                System.out.println("j");
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(ReverseVowels345.reverseVowels(s));
    }

}
