
public class TryWithResourceDemo {
    public static void main(String[] args) {

        // To make use of try-with-resources, make sure that resources must be implemented by AutoClosable(I).
        MyResourceA resourceA = new MyResourceA();
        MyResourceB resourceB = new MyResourceB();
        // Resources mentioned in the try-with-res should be effectively final.
        //multiple resources should be seperated by semi colon (;)
        try(resourceA;resourceB){
            // resourceA = new MyResourceA(); -> error (violating final)
            System.out.println("TRY BLOCK EXECUTED!");
            throw new Exception("something bad!");
        }catch (Exception e){
            System.err.println("ERROR OCCURED!");
        }
//        Output observed:
//        ----------------------
//        MyResourceA
//        MyResourceB
//        TRY BLOCK EXECUTED!
//        MyResourceB closed successfully.
//        MyResourceA closed successfully.
//        ERROR OCCURED!
    }
}
