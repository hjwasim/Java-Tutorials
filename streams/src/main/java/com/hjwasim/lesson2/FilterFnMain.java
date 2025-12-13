package com.hjwasim.lesson2;

import com.hjwasim.model.Employee;
import com.hjwasim.util.EmployeeUtil;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterFnMain {

    /*
      There are 2 types of operation that Streams support
      1. Intermediate operation
      2. Terminal operation

      Intermediate Operation
      =======================
      1. Intermediate operation results in another Stream
      2. Intermediate operations mainly used for data manipulation and transformation.
      3. Intermediate operations can be chained together to build pipelines.
      4. It is lazy by nature

      filter()
      map()
      distinct()
      flatMap()
      sorted()
      peek()
      limit()
      skip()
     */
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getEmployeeList();
        // filter(any --> return boolean) takes Predicate functional interface

        // Find the employee whose salary is more the 160,000
        Predicate<Employee> empSalPredicate = employee -> employee.getSalary() > 160_000;
        Stream<Employee> filteredEmployeesBySal = employees.stream().filter(empSalPredicate);

        // Find the employee whose designation is "Backend Developer"
        Predicate<Employee> empDesPredicate = employee -> employee.getDesignation().equalsIgnoreCase("Backend Developer");
        Stream<Employee> filteredEmployeesByDes = employees.stream().filter(empDesPredicate);

        // Find even numbers from 1 to 10 and it should be greater than 5
        Predicate<Integer> evenNumPredicate = num -> num % 2 == 0;
        Predicate<Integer> greaterThanFivePredicate = num -> num > 5;

        Stream<Integer> greaterEvenNums = IntStream.range(1, 11).boxed()
                .filter(
                        // should be an even number and  greater than 5
                        evenNumPredicate.and(greaterThanFivePredicate)
                );

        // Find even numbers from 1 to 10 and it should not be greater than 5
        Stream<Integer> smallerEvenNums = IntStream.range(1, 11).boxed()
                .filter(
                        // should be an even number and not greater than 5
                        evenNumPredicate.and(greaterThanFivePredicate.negate())
                );

        filteredEmployeesBySal.forEach(System.out::println);
        filteredEmployeesByDes.forEach(System.out::println);
        greaterEvenNums.forEach(num -> System.out.print(num + " "));
        System.out.print("\n");
        smallerEvenNums.forEach(num -> System.out.print(num + " "));

    }
}





















