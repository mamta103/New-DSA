package leetCode.string;

public class Solution1 {
    public static void main(String[] args) {
        String  haystack = "sadbutsad";
        String  needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        return  haystack.indexOf(needle);
    }
}
