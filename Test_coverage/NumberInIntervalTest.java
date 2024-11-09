package seminars.third.coverage;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberInIntervalTest {

    private NumberInInterval numberInInterval;

    @BeforeEach
    void setUp() {
        numberInInterval = new NumberInInterval();
    }

    @Test
    void numberInInterval_withinRange() {
        assertThat(numberInInterval.numberInInterval(26)).isTrue();
        assertThat(numberInInterval.numberInInterval(50)).isTrue();
        assertThat(numberInInterval.numberInInterval(99)).isTrue();
    }

    @Test
    void numberInInterval_outsideRange() {
        assertThat(numberInInterval.numberInInterval(25)).isFalse();
        assertThat(numberInInterval.numberInInterval(100)).isFalse();
        assertThat(numberInInterval.numberInInterval(10)).isFalse();
        assertThat(numberInInterval.numberInInterval(150)).isFalse();
    }
}





