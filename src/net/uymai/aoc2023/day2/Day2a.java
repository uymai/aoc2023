package net.uymai.aoc2023.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day2a {

    public static void main(String[] args) {
        try {
            System.out.println(Files.readAllLines(Path.of("2a.input.txt")).stream().mapToInt(s ->
            {

                String[] gameAndRounds = s.split(":");
                int value = Integer.parseInt(gameAndRounds[0].split(" ")[1]);

                String[] rounds = gameAndRounds[1].trim().split(";");
                for (String round : rounds) {
                    String[] colourAndNumber = round.trim().split(",");
                    for (String colourCount : colourAndNumber) {
                        String[] s1 = colourCount.trim().split(" ");
                        switch (s1[1]) {
                            case "red":
                                if (Integer.parseInt(s1[0]) > 12) {
                                    value = 0;
                                }
                                break;
                            case "green":
                                if (Integer.parseInt(s1[0]) > 13) {
                                    value = 0;
                                }
                                break;
                            case "blue":
                                if (Integer.parseInt(s1[0]) > 14) {
                                    value = 0;
                                }
                                break;
                        }
                    }

                }


                return value;

            }).sum());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
