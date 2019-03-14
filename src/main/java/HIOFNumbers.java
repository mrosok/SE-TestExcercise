
public class HIOFNumbers {

    public static String convert(int x) throws TooNegativeException {

        if (x <= 0) {
            throw new TooNegativeException(x);
        }
        String output = String.valueOf(x);

        if (x % 3 == 0) {
            output = "Hi";
        }

        if (x % 5 == 0) {
            output = "Of";
        }

        if ((x % 5 == 0) && (x % 3 == 0)) {
            output = "HiOf";
        }

        return output;
    }
}
