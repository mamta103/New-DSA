package midum_01;

public class LC02ReverseString {
    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars);
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
       for(int i = 0;i<chars.length-1;i++){
       }
    }
}
