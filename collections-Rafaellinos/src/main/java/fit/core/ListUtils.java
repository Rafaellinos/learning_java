package fit.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtils {
    // <T> método genérico
    public static <T> List<T> sort(List<T> items, Comparator<T> comparator) {
        List<T> sorted = new ArrayList<>(List.copyOf(items));
        sorted.sort(comparator);
        return sorted;
    }
}
