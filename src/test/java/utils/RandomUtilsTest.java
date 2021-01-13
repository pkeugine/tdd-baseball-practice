package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomUtilsTest {

    @Test
    @DisplayName("fixed number when startInclusive and endInclusive are same")
    void testSameNumber() {
        int sample = RandomUtils.nextInt(0, 0);
        assertEquals(0, sample);
    }

    @Test
    @DisplayName("generated number is less than equal to endInclusive")
    void testEndInclusive() {
        int sample = RandomUtils.nextInt(0, 10);
        assertNotEquals(11, sample);
    }

    @Test
    @DisplayName("generated number is greater than equal to startInclusive")

    void testStartInclusive() {
        int sample = RandomUtils.nextInt(1, 10);
        assertNotEquals(0, sample);
    }

    @Test
    @DisplayName("startInclusive cannot be negative integer")
    void testNegativeStartInclusive() {
        assertThrows(IllegalArgumentException.class, () -> RandomUtils.nextInt(-1, 10));
    }

    @Test
    @DisplayName("startInclusive cannot be bigger than endInclusive")
    void testBiggerEndThanStart() {
        assertThrows(IllegalArgumentException.class, () -> RandomUtils.nextInt(10, 1));
    }
}