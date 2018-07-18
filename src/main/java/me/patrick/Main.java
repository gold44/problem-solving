package me.patrick;

import me.patrick.problems.ExcelSheetColumnNumber;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new ExcelSheetColumnNumber(0).printAnswer();
        new ExcelSheetColumnNumber(1).printAnswer();
        new ExcelSheetColumnNumber(26).printAnswer();
        new ExcelSheetColumnNumber(27).printAnswer();
        new ExcelSheetColumnNumber(777).printAnswer();

    }
}
