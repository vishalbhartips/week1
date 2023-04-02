package org.ps;

public class LongestCommonPrefixInStrings {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];
        int n = strs.length;
        int m = first.length();
        for (int i = 0; i < m; i++) {
            char c = first.charAt(i);
            for (int j = 1; j < n; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
