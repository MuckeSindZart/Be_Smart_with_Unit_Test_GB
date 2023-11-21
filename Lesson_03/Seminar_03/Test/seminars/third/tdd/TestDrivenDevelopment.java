package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor
    private MoodAnalyser moodAnalyser;

    @BeforeEach
    void SetUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void goodMoodTest() {
        assertThat(moodAnalyser.analyseMood("Good day")).isEqualTo("happy");
    }

    @Test
    void badMoodTest() {
        assertThat(moodAnalyser.analyseMood("Bad day")).isEqualTo("unhappy");
    }

    @Test
    void normMoodTest() {
        assertThat(moodAnalyser.analyseMood("So so day")).isEqualTo("normal");
    }


}