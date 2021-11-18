package lesson6;

import java.util.Arrays;

public class CopyRunnerArray {
    public static void main(String[] args) {
        String[] words ={"мама","мыла", "раму"};
        String[] anotherwords =copyArray(words);
        anotherwords[words.length]="конец";
        System.out.println(Arrays.toString(anotherwords));
        String[] newArrays = Arrays.copyOf(anotherwords,Math.round(anotherwords.length*1.5f));
        System.out.println(Arrays.toString(newArrays));
        System.out.println("----------------------------");
        String[] effectiveArray =new String[100];
        int firstindex =0;
        System.arraycopy(words,0,effectiveArray,5,words.length-firstindex);
        System.out.println(Arrays.toString(effectiveArray));

    }

    public static String[] copyArray(String[] words){
        String[] newArray= new String[Math.round(words.length*1.5f)];
        for (int i =0;i< words.length;i++){
            newArray[i]=words[i];
        }
        return newArray;
    }
}

