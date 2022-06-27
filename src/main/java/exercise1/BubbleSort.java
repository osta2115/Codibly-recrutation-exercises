package exercise1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class BubbleSort {

    public static List<String> sort(List<String> input) throws RuntimeException {
        return input.stream()
                    .filter(Objects::nonNull)
                    .sorted(String::compareTo)
                    .collect(Collectors.toList());
    }
}
