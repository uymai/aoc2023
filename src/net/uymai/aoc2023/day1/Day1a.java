package net.uymai.aoc2023.day1;

import java.util.Arrays;

public class Day1a {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(args).map(s -> s.replaceAll("[^0-9]", "")).mapToInt(numbers ->
                        Integer.parseInt(numbers.charAt(0) + "" + numbers.charAt(numbers.length() - 1))
                ).

                sum());
    }
}
