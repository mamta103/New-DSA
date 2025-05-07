package java100codes;

public class CompareTwoStringJava {
    public static void main(String[] args) {
        String s1 = "Mamta";
        String s2 = "Mamta";
        compareString(s1, s2);
    }

    private static void compareString(String s1, String s2) {
        if(s1.equals(s2)){
            System.out.println(s1 + " is exactly equal to " + s2);
        }
        else if(s1.length() == s2.length()) {
            System.out.println(s1 + " String is equal to  " + s2);
        }
        else if (s1.length() < s2.length()) {
            System.out.println(s1 + " String length smaller than " + s2);
        }
        else {
            System.out.println(s1 + " String length bigger than " + s2);
        }
    }
}
