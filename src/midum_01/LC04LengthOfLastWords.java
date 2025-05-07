package midum_01;

public class LC04LengthOfLastWords {
    public static void main(String[] args) {
        String s = "Hello World";
        String []words = s.trim().split("\\s+");
        System.out.println(words[words.length-1].length());

    }
}
