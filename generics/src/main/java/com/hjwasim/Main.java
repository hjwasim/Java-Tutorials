package com.hjwasim;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
           1. Reusability with Generics
           - Java Generics eliminate the limitation of writing multiple implementations for different data types
           - Generic class or method can be written once and reused with multiple data types - Reduced code duplication.
           Below example : CommonBox is reused for different data types while maintaining type-safety.
         */
        // 1. String Common Box
        CommonBox<String> stringCommonBox = new CommonBox<>();
        stringCommonBox.setItem("This is secret string...");
        System.out.println(stringCommonBox.getItem());

        // 2. Integer Common Box
        CommonBox<Integer> integerCommonBox = new CommonBox<>();
        integerCommonBox.setItem(1);
        System.out.println(integerCommonBox.getItem());

        // 3. Double Common Box
        CommonBox<Double> doubleCommonBox = new CommonBox<>();
        doubleCommonBox.setItem(1.0);
        System.out.println(doubleCommonBox.getItem());

        /*
           2. Elimination of Explicit Casting
           One of the major benefits of Java Generics is the removal of manual type-casting [error-prone and difficult to maintain]
           Generic catches the type-errors at compile-time NOT at the runtime.
         */
        List commonList = new ArrayList();
        commonList.add("Chennai");
        String strValue = (String) commonList.get(0); // here, manual explicit type casting required, we are unsure what data the list has

        List<String> stringList = new ArrayList<>();
        stringList.add("Chennai");
        String strValue2 = stringList.get(0); // No type casting required here...
    }
}