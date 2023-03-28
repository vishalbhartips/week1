package org.ps;
import java.util.*;

public class MatchingSubsequence {
    public static int numMatchingSubseq(String s, String[] words) {
        Map<Character, Queue<String>> map = new HashMap<>();
        int ans = 0;

        for(int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), new LinkedList<>());
        }

        for(String word : words) {
            char startChar = word.charAt(0);
            if(map.containsKey(startChar)) {
                map.get(startChar).offer(word);
            }
        }
        for(int i = 0; i < s.length(); i++) {
            char startChar = s.charAt(i);
            Queue<String> q = map.get(startChar);
            int size = q.size();
            for(int k = 0; k < size; k++) {
                String str = q.poll();
                if(str.substring(1).length() == 0) {
                    ans++;
                } else {
                    if(map.containsKey(str.charAt(1))) {
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"a","bb","acd","ace"};
        String s = "abcde";
        System.out.println(numMatchingSubseq(s, words));
    }
}
