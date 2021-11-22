package lesson6;

import java.util.Arrays;

public class WordReducerRunner {
    public static void main(String[] args) {
        String[] words = {"Большой", "привет", "от", "слушателей", "ИТ парка", "от" };
        System.out.println(Arrays.toString(Intersect(words, "от")));
        System.out.println(Arrays.toString(Intersect(words, "привет")));
    }

    public static String[] Intersect(String[] initialArray, String word) {
        String[] result = new String[initialArray.length];
        System.arraycopy(initialArray, 0, result, 0, initialArray.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals(word)) {
                result[i] = null;
            }
        }

        int maxNotNullIndexes = 0;
        for (String str : result) {
            if (str != null) {
                maxNotNullIndexes++;
            }
        }

        String[] newResult = new String[maxNotNullIndexes];
        int counter = 0;
        for (String str : result) {
            if (str != null) {
                newResult[counter++] = str;
            }


        }

        return newResult;
    }
}
