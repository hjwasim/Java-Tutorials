class Main {
    public static void main(String[] args) {
        //Automatic conversion of primitive type into wrapper object type.
        Integer i = 10;
        systemOutPrintln("Auto boxing");

        //Automatic conversion of wrapper object type into primitive type.
        Integer i1 = new Integer(20);
        int x = i1;
        systemOutPrintln("Auto-unboxing);

    }
}