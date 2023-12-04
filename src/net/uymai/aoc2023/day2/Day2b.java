package net.uymai.aoc2023.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day2b {
    public static void main(String[] args) {
        try {
            System.out.println(Files.readAllLines(Path.of("2a.input.txt")).stream().mapToInt(s ->
            {
                String[] gameAndRounds = s.split(":");
                String[] rounds = gameAndRounds[1].trim().split(";");
                int maxRed = 0;
                int maxGreen = 0;
                int maxBlue = 0;
                for (String round : rounds) {
                    String[] colourAndNumber = round.trim().split(",");
                    for (String colourCount : colourAndNumber) {
                        String[] s1 = colourCount.trim().split(" ");
                        int i = Integer.parseInt(s1[0]);
                        switch (s1[1]) {
                            case "red":
                                if (i > maxRed) {
                                    maxRed = i;
                                }
                                break;
                            case "green":
                                if (i > maxGreen) {
                                    maxGreen = i;
                                }
                                break;
                            case "blue":
                                if (i > maxBlue) {
                                    maxBlue = i;
                                }
                                break;
                        }
                    }
                }


                return maxRed * maxBlue * maxGreen;

            }).sum());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
