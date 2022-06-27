package exercise2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BalancedWordsCounterTest {

    @Test
    void firstTestCase() {
        //given
        String input = "aabbabcccba";

        //when
        Integer actualResult = BalancedWordsCounter.count(input);
        Integer expectedResult = 28;

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void secondTestCase() {
        //given
        String input = "";

        //when
        Integer actualResult = BalancedWordsCounter.count(input);
        Integer expectedResult = 0;

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void thirdTestCase() {
        assertThrows(RuntimeException.class, () -> {
            String input = "abababa1";
            Integer actualResult = BalancedWordsCounter.count(input);
        });
    }

    @Test
    void fourthTestCase() {
        assertThrows(RuntimeException.class, () -> {
            String input = null;
            Integer actualResult = BalancedWordsCounter.count(input);
        });
    }
}