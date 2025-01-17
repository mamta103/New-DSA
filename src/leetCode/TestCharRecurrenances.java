package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TestCharRecurrenances
{
    public static void main(String[] args) {
        String s = "sunilsunil";
        boolean isSameOccurances = findCharOccurancesInString(s);
        System.out.println("======isSameOccured:"+isSameOccurances);
    }

    private static boolean findCharOccurancesInString(String s) {
    char [] array = s.toCharArray();
        Map<Character, Integer> charGrouped = new HashMap<>();
    for (Character ch : array){
        if(charGrouped.containsKey(ch)){
            Integer value = charGrouped.get(ch);
            charGrouped.put(ch, value+1);
        }else {
            charGrouped.put(ch, 1);
        }

    }

    System.out.println("======="+charGrouped);
    if(charGrouped.values().stream().distinct().count() == 1){
return true;
    }
        return false;
    }
}