package org.ps;

import java.util.*;

//https://leetcode.com/problems/longest-word-in-dictionary/submissions/
public class LongestWordInDictionary {
    public static String longestWord(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));

        String longestWord = "";
        for(String word : words) {
            if(word.length() < longestWord.length()  ||
                    (word.length() == longestWord.length() && (word.compareTo(longestWord) > 0))) {
                continue;
            }

            boolean isLongestWord = true;
            for(int i = 1; i < word.length(); i++) {
                if (!set.contains(word.substring(0, i))) {
                    isLongestWord = false;
                    break;
                }
            }

            if(isLongestWord) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String[] words1 = {"w","wo","wor","worl","world"};
        String[] words2 = {"a","banana","app","appl","ap","apply","apple"};
        System.out.println(longestWord(words1));
        System.out.println(longestWord(words2));
    }
}
