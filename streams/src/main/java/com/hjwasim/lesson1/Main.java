package com.hjwasim.lesson1;

import com.hjwasim.model.Employee;
import com.hjwasim.util.EmployeeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeUtil.getEmployeeList();

        // creation of sequential stream
        Stream<Employee> sequentialStream = employees.stream(); // preserves order

        // creation of parallel stream
        Stream<Employee> parallelStream = employees.stream().parallel(); // order cannot be guaranteed

        // Creating streams from primitive types
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stringStream = Stream.of("Madurai", "Chennai", "Pune");
        Stream<Boolean> booleanStream = Stream.of(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE);

        // creating streams using other classes - IntStream, LongStream, DoubleStream
        Stream<Integer> intStream = IntStream.range(1,5).boxed(); // 1 to 4
        Stream<Integer> intStreamRangeClosed = IntStream.rangeClosed(1, 5).boxed(); // 1 to 5

        String[] cities = {"Madurai", "Chennai", "Pune"};
        Stream<String> cityStream = Arrays.stream(cities);

        // creating streams using stream-builder
        Stream.Builder<Employee> builder = Stream.builder();
        Stream<Employee> builderStream = builder
                .add(new Employee(1L, "HJ Wasim", "FSE", 9000.0, 4))
                .add(new Employee(2L, "YP", "SE", 8000.0, 3))
                .add(new Employee(3L, "Waz", "TL", 12000.0, 5))
                .build();


        // 2. Printing Stream values
        // ==========================================

        // Using lambda expression
        sequentialStream.forEach(employee -> System.out.println(employee));
        System.out.println(" ============================ ");
        // Using method reference
        parallelStream.forEach(System.out::println);


    }
}