package leetCode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] input= {0,0,1,1,1,2,2,3,3,4};
        ((Consumer<int[]>) input1 -> {
            int[] output = Arrays.stream(input1).distinct().toArray();
            System.out.println(output.length);
        }).accept(input);
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i:input){
//            if(map.containsKey(i)){
//                int value = map.get(i);
//                map.put(i,value++);
//            }else{
//                map.put(i, 1);
//
//            }
//        }
//        System.out.println("Map: "+map);
//     for(Map.Entry<Integer,Integer> m: map.entrySet()){
//         System.out.println(m.getKey());
//     }
    }
}
