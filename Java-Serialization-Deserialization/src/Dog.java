import java.io.Serializable;

public class Dog implements Serializable {
    private int i = 10;
    private int j = 20;

    public int get() {
        return i + j;
    }
}
