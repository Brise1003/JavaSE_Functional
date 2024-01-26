package com.platzi.functional._13_partial_application;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "Frontend",
                "Backend",
                "Fullstack");

        for(String course : courseList){
            String newCourseName = course.toLowerCase().replace("!", "!!");
            System.out.println("Platzi: " + newCourseName);
        }

        Stream<String> courseStream = Stream.of("Java",
                "Frontend",
                "Backend",
                "Fullstack");

        //Stream<Integer> courseLenghtStream = courseStream.map(course -> course.length());

        //Optional<Integer> longest = courseLenghtStream.max((x, y)-> y - x);

        Stream<String> emphasisCourses = courseStream.map(course->course+ "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course->course.contains("Java"));
        justJavaCourses.forEach(System.out::println);

        Stream<String> coursesStream2 = courseList.stream();

        addOperator(
        coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
        ).forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream){
        return stream.peek(data -> System.out.println("Dato: " + data));
    }
}
