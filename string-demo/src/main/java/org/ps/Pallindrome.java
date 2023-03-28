package org.ps;

public class Pallindrome {

    public static boolean isPallindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "adcda";
        System.out.println(isPallindrome(s1));
    }
}
