package hw15;


import java.util.*;
import java.util.stream.Collectors;


public class StreamRunner {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit",
                "Sed", "sodales", "consectetur", "purus", "at", "faucibus", "Donec", "mi", "quam", "tempor", "vel", "ipsum", "non", "faucibus", "suscipit", "massa",
                "Morbi", "lacinia", "velit", "blandit", "tincidunt", "efficitur", "Vestibulum", "eget", "metus", "imperdiet", "sapien", "laoreet", "faucibus", "Nunc", "eget", "vehicula", "mauris", "ac", "auctor", "lorem",
                "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "Integer", "vel", "odio", "nec", "mi", "tempor", "dignissim");
        Map<String, Integer> quanitityWords = words.parallelStream().collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
        System.out.println("Количество слов: " + quanitityWords);
        System.out.println("-----------------");
        Spliterator<String> spliterator = words.stream().spliterator();
        Spliterator<String> newSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println)) {
        }
        while (newSpliterator.tryAdvance(System.out::println)) {
        }
        Collections.sort(words, Collections.reverseOrder());
        for (List<String> reverseWords : Arrays.asList(words)) {
            System.out.println("Отсортированные слова по убыванию: " + reverseWords);
        }
    }
}
