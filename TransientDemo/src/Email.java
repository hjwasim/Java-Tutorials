import java.io.Serializable;

public class Email implements Serializable {
    String email = "java@java.com";
    transient String password = "java2023";
    transient static String password1 = "java2023"; //no impact - will not participate in serializ...
    final String password2 = "java2023"; //no impact - will participate in serialz...
    //Just to ignore the field from getting serialized.

    public String  get() {
        return email;
    }
}
