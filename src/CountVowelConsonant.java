
public class CountVowelConsonant {
    public static void main(String[] args) {
        String s1 = "Mamtayadav";
        s1 = s1.trim().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'o') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("vowelCount: " + vowelCount);
        System.out.println("consonantCount: " + consonantCount);
    }
}
