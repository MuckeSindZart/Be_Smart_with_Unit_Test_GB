package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    // 3.1.
    private SomeService someService;

    @BeforeEach
    void setUp90() {
        someService = new SomeService();
    }

    @Test
    void fizzBuzzTest() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
        assertThat(someService.fizzBuzz(11)).isEqualTo("11");
    }

    @Test
    void firstLast6Test(){
        assertThat(someService.firstLast6(new int[]{1,5,4,3,2,6})).isEqualTo(true);
        assertThat(someService.firstLast6(new int[]{6,5,4,3,2,1})).isEqualTo(true);
    }

    @Test
    void test(){
        assertThat(10).isEqualTo(10);
    }

    @Test
    void luckyNumsTest(){
        assertThat(someService.luckySum(1,2,3)).isEqualTo(6);
    }
    @Test
    void luckySumTest(){
        assertThat(someService.luckySum(13,2,3)).isEqualTo(5);
    }

}