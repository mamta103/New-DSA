package hackerrank.com;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int totalStringLength= A.length()+ B.length();
        System.out.println(totalStringLength);
        boolean isTrue = false;
        if(A.length() > B.length()){
            isTrue = true;
            System.out.println("No");

        }
        else {
            isTrue =false;
            System.out.println("Yes");
        }
        String capitalized  = A.substring(0,1).toUpperCase()+A.substring(1)+ " "+B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capitalized);

    }
}



