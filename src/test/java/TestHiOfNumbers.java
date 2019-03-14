import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestHiOfNumbers {
    @Test
    public void Prints_1_for_1() throws TooNegativeException {
        String value = HIOFNumbers.convert(1);
        assertEquals("1", value);
    }
    @Test
    public void Prints_98_for_98() throws TooNegativeException {
        String value = HIOFNumbers.convert(98);
        assertEquals("98", value);
    }

    @Test
    public void Prints_Hi_For_3() throws TooNegativeException {
        String value = HIOFNumbers.convert(3);
        assertEquals("Hi", value);
    }

    @Test
    public void Prints_Hi_For_99() throws TooNegativeException {
        String value = HIOFNumbers.convert(99);
        assertEquals("Hi", value);
    }

    @Test
    public void Prints_Of_For_5() throws TooNegativeException {
        String value = HIOFNumbers.convert(5);
        assertEquals("Of", value);
    }

    @Test
    public void Prints_Of_For_95() throws TooNegativeException {
        String value = HIOFNumbers.convert(95);
        assertEquals("Of", value);
    }

    @Test
    public void Prints_HiOf_For_15() throws TooNegativeException {
        String value = HIOFNumbers.convert(15);
        assertEquals("HiOf", value);
    }

    @Test
    public void Prints_HiOf_For_90() throws TooNegativeException {
        String value = HIOFNumbers.convert(90);
        assertEquals("HiOf", value);
    }

    // TEST EXCEPTIONS

    @Test
    public void ThrowsExceptionIfArgumentIsZero() {
        assertThrows(TooNegativeException.class, () -> {
            HIOFNumbers.convert(0);
        });
    }

    @Test
    public void ThrowsExceptionIfArgumentIsNegative() {
        assertThrows(TooNegativeException.class, () -> {
            HIOFNumbers.convert(-2);
        });
    }
}
