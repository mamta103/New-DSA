package leetCode.string;

public class IndexOfExample1 {
    public static void main(String[] args) {
        String str = "Hello World!";
        char ch = '@';

        int index = str.indexOf(ch);
        System.out.println("First occurrence of '" + ch + "' is at index: " + index);

    }
}
