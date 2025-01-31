//package leetCode;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class CountWords {
//    public static void main(String[] args) {
//        String input = "aaaa";
//
//        Map<Character , Long> map= new HashMap<>();
//       map = input.chars().mapToObj(c->c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        char[] chaArr= input.toCharArray();
//        for (char ch: chaArr){
//            if(map.containsKey(ch)){
//                int value = map.get(ch);
//                map.put(ch,value+1);
//            }
//            else{
//                map.put(ch, 1);
//            }
//        }
//        System.out.println(map
//        );
//
//    }
//}
