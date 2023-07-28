import java.util.Optional;

class Main {
    public static void main(String[] args) {
        Integer i = 10;
        boolean result = usingStandardWay(i);
        //System.out.println(result);

        //check for different int instances
        int t1 = 0;
        // t2 = null case
        int t3 = 34;

        //t1
        result = usingOptionalClass(t1);
        System.out.println(result);

        //t2
        result = usingOptionalClass(null);
        System.out.println(result);

        //t3
        result = usingOptionalClass(t3);
        System.out.println(result);

    }

    //using straightforward function
    static boolean usingStandardWay(Integer num){
        return num == null || num == 0;
    }

    //using ternary operator
    static boolean usingTernaryOperator(Integer num){
        // always check null at first
        return (num == null || num == 0) ? true : false;
    }

    //using Optional class
    static boolean usingOptionalClass(Integer num){
        return Optional.ofNullable(num).orElse(0) == 0;
    }

    //By using ObjectUtils, we can also check.

}