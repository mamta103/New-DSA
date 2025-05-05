package ParallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Seeta", "Geeta");
        names.parallelStream().forEach(
                name -> System.out.println(name + " - " + Thread.currentThread().getName()));

    }
}

/*Output
Seeta - main
Shyam - ForkJoinPool.commonPool-worker-1
Geeta - ForkJoinPool.commonPool-worker-3
Ram - ForkJoinPool.commonPool-worker-2
*/