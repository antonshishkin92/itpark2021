package hw15;


import java.util.List;
import java.util.Spliterator;


public class StreamRunner {
    public static void main(String[] args) {
        List<String> words = List.of("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit.", "Sed", "sodales", "consectetur", "purus", "at", "faucibus.", "Donec", "mi", "quam", "tempor", "vel", "ipsum", "non", "faucibus", "suscipit", "massa.", "Morbi", "lacinia", "velit", "blandit", "tincidunt", "efficitur.",
                "Vestibulum", "eget", "metus", "imperdiet", "sapien", "laoreet", "faucibus.", "Nunc", "eget", "vehicula", "mauris,", "ac", "auctor", "lorem.",
                "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit.", "Integer", "vel", "odio", "nec", "mi", "tempor", "dignissim.");
        Spliterator<String> spliterator = words.stream().spliterator();
        Spliterator<String> newSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println)) {
        }
        while (newSpliterator.tryAdvance(System.out::println)) {
        }


    }
}
