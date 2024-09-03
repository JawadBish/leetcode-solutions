package leetcode75.medium;

import leetcode75.easy.ReverseVowels345;

public class ReverseWords151 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder returnedString = new StringBuilder();
        for (int i = words.length -1  ; i >=0 ; i-- ) {
            returnedString.append(words[i]);
            if(i != 0) {
                returnedString.append(" ");
            }
        }
        return returnedString.toString();
    }

    public static void main(String[] args) {
        String w = "the sky is blue";
        System.out.println(reverseWords(w));
        //blue is sky the

    }
}
