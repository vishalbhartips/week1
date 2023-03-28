package org.ps;

public class RemovePallindromicSubsequesnce {
    public static int removePalindromeSub(String s) {
        if(s == null || s.isEmpty()) return 0;
        else if(Pallindrome.isPallindrome(s)) return 1;
        else return 2;
    }

    public static void main(String[] args) {
        String s = "abb";
        String s1 = "baabb";
        String s2 = "ababa";
        System.out.println(removePalindromeSub(s));
        System.out.println(removePalindromeSub(s1));
        System.out.println(removePalindromeSub(s2));
    }
}
