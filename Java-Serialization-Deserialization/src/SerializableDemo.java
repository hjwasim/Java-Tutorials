import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
    public static void main(String[] args) throws IOException {
        Dog d1 = new Dog();
        System.out.println("Serialization");
        System.out.println(d1.get());

        //Serialization Starts
        FileOutputStream fos = new FileOutputStream("hjwasim.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.flush();
        //Serialization Ends
    }
}
