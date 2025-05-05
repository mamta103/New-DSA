package leetCode.string;

public class IndexOfExample2 {
    public static void main(String[] args) {
        String text = "Java is powerful and Java is popular!";
        String target = "Java";
        int firstIndex = text.indexOf(target);
        System.out.println("First occurrence of \"" + target + "\" is at index: " + firstIndex);
        int secondIndex = text.indexOf(target, firstIndex + 1);
        System.out.println("Second occurrence of \"" + target + "\" is at index: " + secondIndex);
    }
}
//output: First occurrence of "Java" is at index: 0
//Second occurrence of "Java" is at index: 21