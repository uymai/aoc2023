package net.uymai.aoc2023.day1;

import java.util.Arrays;

public class Day1b {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(args)
                .map(s -> s.replaceAll("one", "one1one"))
                .map(s -> s.replaceAll("two", "two2two"))
                .map(s -> s.replaceAll("three", "three3three"))
                .map(s -> s.replaceAll("four", "four4four"))
                .map(s -> s.replaceAll("five", "five5five"))
                .map(s -> s.replaceAll("six", "six6six"))
                .map(s -> s.replaceAll("seven", "seven7seven"))
                .map(s -> s.replaceAll("eight", "eight8eight"))
                .map(s -> s.replaceAll("nine", "nine9nine"))
                .map(s -> s.replaceAll("[^0-9]", ""))
                .mapToInt(numbers ->
                        Integer.parseInt(numbers.charAt(0) + "" + numbers.charAt(numbers.length() - 1))

                ).sum());
    }
}
