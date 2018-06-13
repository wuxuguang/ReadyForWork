package java8.lamda;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        File[] hiddenFiles = new File("/Users/wuxuguang").listFiles(File::isHidden);


        List<Integer> l = map(Arrays.asList("lamdas", "in", "action"), (String s) -> s.length());
        l.forEach(System.out::println);


        List<Apple> list = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        list.sort( (Apple a1, Apple a2) -> a1.getWeight() - a1.getWeight());

    }


    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }



}
