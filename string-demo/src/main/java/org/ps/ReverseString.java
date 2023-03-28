package org.ps;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hi I am Vishal";
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
