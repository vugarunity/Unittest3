package seminars.third.coverage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EvenOddNumberTest {

    private final EvenOddNumber evenOddNumber = new EvenOddNumber();

    @Test
    void evenOddNumberTest_even() {

        assertThat(evenOddNumber.evenOddNumber(4)).isTrue();
        assertThat(evenOddNumber.evenOddNumber(8)).isTrue();
    }

    @Test
    void evenOddNumberTest_odd() {

        assertThat(evenOddNumber.evenOddNumber(5)).isFalse();
        assertThat(evenOddNumber.evenOddNumber(29)).isFalse();
    }
}
