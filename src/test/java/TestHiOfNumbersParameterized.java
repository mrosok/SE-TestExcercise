import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestHiOfNumbersParameterized{

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 87, 93, 96, 99})
    public void ifArgumentIsDivisibleByThreeReturnHi(int argument) throws TooNegativeException {
        String value = HIOFNumbers.convert(argument);
        Assertions.assertEquals("Hi", value);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 80, 85, 95})
    public void ifArgumentIsDivisibleByFiveReturnOf(int argument) throws TooNegativeException {
        String value = HIOFNumbers.convert(argument);
        Assertions.assertEquals("Of", value);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    public void ifArgumentIsDivisibleByThreeAndFiveReturnHiOf(int argument) throws TooNegativeException {
        String value = HIOFNumbers.convert(argument);
        Assertions.assertEquals("HiOf", value);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 8, 22, 26, 76, 98})
    public void returnsArgumentAsString(int argument) throws TooNegativeException {
        String value = HIOFNumbers.convert(argument);
        Assertions.assertEquals(String.valueOf(argument), value);
    }

}


