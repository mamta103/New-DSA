package java8;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.net.URL;
    import java.util.*;
    import java.util.function.Function;
    import java.util.stream.Collectors;

    public class TextAnalysis {
        private static final Set<String> STOP_WORDS = Set.of("in", "on", "at", "he", "she", "it", "and", "or", "but", "the", "a", "an", "is", "was");

        public static void main(String[] args) throws IOException {
            URL url = new URL("https://courses.cs.washington.edu/courses/cse390c/22sp/lectures/moby.txt");
            StringBuilder contentBuilder = new StringBuilder();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    contentBuilder.append(inputLine).append(" ");
                }
            }

            String content = contentBuilder.toString();
            List<String> words = Arrays.stream(content.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(" "))
                    .filter(word -> !word.isBlank() && !STOP_WORDS.contains(word))
                    .collect(Collectors.toList());

            // Total word count
            System.out.println("Total word count: " + words.size());

            // Word frequency count
            Map<String, Long> wordCounts = words.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            // Top 5 words
            wordCounts.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(5)
                    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

            // Unique words sorted alphabetically (top 50)
            List<String> uniqueWords = new ArrayList<>(wordCounts.keySet());
            Collections.sort(uniqueWords);
            System.out.println("Top 50 unique words:");
            uniqueWords.stream().limit(50).forEach(System.out::println);
        }
    }