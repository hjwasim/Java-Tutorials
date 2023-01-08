import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Email email = new Email();

        FileOutputStream fos = new FileOutputStream("hjwasim.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(email);

        FileInputStream fis =  new FileInputStream("hjwasim.txt");
        ObjectInputStream ois =  new ObjectInputStream(fis);
        Email email1 = (Email) ois.readObject();
        System.out.println(email1.email); // java@java.com, It is a part of email obj state.
        System.out.println(email1.password); // null. because, we mentioned it with transient.
        System.out.println(email1.password1); //accesing a static var using instance.
        System.out.println(email1.password2);
    }
}
