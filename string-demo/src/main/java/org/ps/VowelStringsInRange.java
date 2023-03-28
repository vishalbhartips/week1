package org.ps;

public class VowelStringsInRange {
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        int n = right >= words.length ? words.length - 1 : right;
        for(int i = left; i <= n; i++) {
            String s = words[i];
            if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1)))
                count++;
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args) {
        String[] words = {"are","amy","u"};
        int left = 0;
        int right = 2;
        System.out.println(vowelStrings(words, left, right));
    }
}
