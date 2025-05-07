package sapient;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxValues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 15, 7, 8, 23);

      Optional<Integer> result = numbers.stream().max(Integer::compareTo).orElse(null).describeConstable();
        System.out.println(result);

        int resultOfMin = numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if(resultOfMin >  numbers.get(i)){
                resultOfMin = numbers.get(i);
            }
        }
        System.out.println("Minimum value: " + resultOfMin);

        int resultOfMax = numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if(resultOfMax < numbers.get(i)){
                resultOfMax = numbers.get(i);
            }

        }
        System.out.println("Maximum value: " + resultOfMax);


     Optional<Integer> minNum =   numbers.stream().min(Integer::compareTo);
        System.out.println(minNum.get());


        Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);
        System.out.println(maxNum.get());
    }
}
