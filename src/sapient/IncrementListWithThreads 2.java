//package sapient;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//import java.util.*;
//import java.util.concurrent.*;
//
//public class IncrementListWithThreads {
//
//    public static void main(String[] args) throws InterruptedException {
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        int numThreads = 3;
//
//        List<Integer> result = incrementList(numbers, numThreads);
//        System.out.println("Updated List: " + result);
//    }
//
//    public static List<Integer> incrementList(List<Integer> numbers, int numThreads) throws InterruptedException, ExecutionException {
//        int size = numbers.size();
//        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
//        List<Future<?>> futures = new ArrayList<>();
//
//        for (int i = 0; i < numThreads; i++) {
//            int start = i * size / numThreads;
//            int end = (i + 1) * size / numThreads;
//
//            futures.add(executor.submit(() -> {
//                for (int j = start; j < end; j++) {
//                    // Synchronize if you're using a shared list
//                    synchronized (numbers) {
//                        numbers.set(j, numbers.get(j) + 1);
//                    }
//                }
//            }));
//        }
//
//        // Wait for all tasks to complete
//        for (Future<?> future : futures) {
//            future.get(); // Throws exception if task failed
//        }
//
//        executor.shutdown();
//        return numbers;
//    }
//}