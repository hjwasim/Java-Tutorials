public class MyResourceA implements AutoCloseable{

    public MyResourceA(){
        System.out.println("MyResourceA");
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResourceA closed successfully.");
    }
}
