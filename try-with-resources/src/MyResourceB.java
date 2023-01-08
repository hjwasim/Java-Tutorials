public class MyResourceB implements AutoCloseable{

    public MyResourceB(){
        System.out.println("MyResourceB");
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResourceB closed successfully.");
    }
}
