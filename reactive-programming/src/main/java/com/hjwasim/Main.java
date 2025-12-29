package com.hjwasim;

import reactor.core.publisher.Mono;

public class Main {
    /*
    map is used when a transformation function returns a plain value.
    flatMap is used when a transformation function returns another Mono<T> or Flux<T>.
     */
    public static void main(String[] args) {
        // Ex - 1 - map()
        // map is used when we wanted to perform synchronous transformation
        // T -> R
        Mono<Integer> number = Mono.just(5);
        Mono<Integer> squared = number.map(num -> num * num); // plain num\
        //   squared.subscribe(System.out::println); // 25

        // Ex - 2
        // Wrong example for map() usage
        Mono<Mono<Integer>> mapSquared = number.map(num -> Mono.just(num * num)); // mono num
       // mapSquared.subscribe(System.out::println);
        //  Mono<Mono<Integer>> is never useful...

        // Ex - 3 - flatMap()
        // Fixed with flatMap - it unwraps the inner mono
        Mono<Integer> flatMapSquared = number.flatMap(num -> Mono.just(num * num)); // mono num
        //   flatMapSquared.subscribe(System.out::println);

        // Ex - 4
        int userId = 24;
        exists(userId)
                .flatMap(found -> {
                    if (found) {
                        return Mono.error(new RuntimeException("This is an error"));
                    }
                    return findUserById(userId);
                })
                .subscribe(System.out::println);

    }

    // Reactive DB methods
    static Mono<Boolean> exists(Integer id) {
        return Mono.just(id == 23);
    }

    static Mono<String> findUserById(Integer id) {
        return Mono.just("user-"+id);
    }
}