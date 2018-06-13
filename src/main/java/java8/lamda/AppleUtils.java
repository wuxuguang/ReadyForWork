package java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class AppleUtils {

    public static List<Apple> filterApplesByColor(List<Apple> list, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : list) {
            if (a.getColor().equals(color))
                result.add(a);
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> list, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : list) {
            if (a.getWeight() > weight)
                result.add(a);
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> list, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : list) {
            if (predicate.test(a))
                result.add(a);
        }
        return result;
    }
}
