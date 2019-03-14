
public class TooNegativeException extends Exception {
    int id;

    public TooNegativeException(int id) {
        this.id = id;
    }

    public String toString() {
        return "TooNegativeException (" + id + ")";
    }
}
