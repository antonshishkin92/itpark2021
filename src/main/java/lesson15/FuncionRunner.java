package lesson15;

import java.util.function.Function;

public class FuncionRunner {

    public static void main(String[] args) {
        final String value="Тестовая строка";
        Function<String,Integer>str2Int=str->Integer.decode(str);
       Integer result123 = str2Int.apply("123");
        System.out.println(result123);
        Integer result1 = str2Int.apply("1");
        System.out.println(result1);
        Comparable<String> comparable = str->value.compareTo(str);
        System.out.println(summa("123","325",str2Int,comparable));
        System.out.println(summa("1235","32547",str2Int,comparable));

    }

public static int summa(String arg1,String arg2,Function<String,Integer> converter,Comparable<String> comparable){
        return (comparable.compareTo(arg1)>0 ?converter.apply(arg1):0)+
                (comparable.compareTo(arg2)>0 ? converter.apply(arg2):0);


}

}
