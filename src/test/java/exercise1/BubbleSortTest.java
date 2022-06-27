package exercise1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BubbleSortTest {

    @Test
    void firstTestCase() {
        //given
        List<String> input = List.of("1", "4", "5", "6", "8", "3", "8");

        //when
        List<String> actualResult = BubbleSort.sort(input);
        List<String> expectedResult = List.of("1", "3", "4", "5", "6", "8", "8");

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void secondTestCase() {
        //given
        List<String> input = List.of("-9.3", "0.2", "4", "0.1", "5", "9");

        //when
        List<String> actualResult = BubbleSort.sort(input);
        List<String> expectedResult = List.of("-9.3", "0.1", "0.2", "4", "5", "9");

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void thirdTestCase() {
        //given
        List<String> input = List.of();

        //when
        List<String> actualResult = BubbleSort.sort(input);
        List<String> expectedResult = List.of();

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void fourthTestCase() {
        //given
        List<String> input = new ArrayList<>();
        input.add(null);
        input.add("5.0001");

        //when
        List<String> actualResult = BubbleSort.sort(input);
        List<String> expectedResult = List.of("5.0001");

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void fifthTestCase() {
        assertThrows(RuntimeException.class, () -> {
            List<String> input = null;
            List<String> actualResult = BubbleSort.sort(input);
        });
    }
}