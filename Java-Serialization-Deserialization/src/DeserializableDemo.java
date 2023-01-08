import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Deserialization");
        //Deserialization Starts
        FileInputStream fis = new FileInputStream("hjwasim.txt");
        ObjectInputStream oos = new ObjectInputStream(fis);
        Dog d2 = (Dog) oos.readObject();
        System.out.println(d2.get());
        //Deserialization Ends
    }
}
