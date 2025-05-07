package midum_01;

public class StringCostantPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";


        System.out.println("s1==s2:: " + s1 == s2);
        System.out.println("s2==s3:: " + s2 == s3);
        System.out.println("s3==s1:: " + s3 == s1);


        System.out.println("s1.equals(s2):: " + s1.equals(s2));
        System.out.println("s2.equals(s3):: " + s2.equals(s3));
        System.out.println("s3.equals(s1):: " + s3.equals(s1));

        

    }
}
