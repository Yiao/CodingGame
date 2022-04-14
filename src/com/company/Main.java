package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("How many lines you want  ?  ");
            System.out.println("Enter a number : ");
            Scanner in = new Scanner(System.in);

            int lineNumber = in.nextInt();
            int columnNumber = lineNumber * 2 - 1;

            System.out.println("Line number : " + lineNumber);
            System.out.println("column number : " + columnNumber);

            IntStream.range(0, lineNumber).forEach(linePosition -> {
                        ArrayList<String> lineInfo = new ArrayList<>();
                        int startPosition = columnNumber - linePosition - lineNumber;
                        int endPosition = lineNumber + linePosition;
                        IntStream.range(0,columnNumber).forEach(columnPosition -> {
                            if (columnPosition < startPosition || columnPosition >= endPosition) {
                                lineInfo.add("O");
                            } else {
                                lineInfo.add("x");
                            }
                        });
                        System.out.println(lineInfo);
                    }
            );
        } catch (Exception e) {
            System.out.println("Need a number");
        }
    }
}
