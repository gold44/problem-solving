package me.patrick.problems;

import me.patrick.Solution;

import java.util.Arrays;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * -----------------------
 * <p>
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * -----------------------
 * <p>
 * Example 1:
 * Input: "A"
 * Output: 1
 * <p>
 * Example 2:
 * Input: "AB"
 * Output: 28
 * <p>
 * Example 3:
 * Input: "ZY"
 * Output: 701
 * -----------------------
 */
public class ExcelSheetColumnNumber extends Solution {
    private static final int DIVISOR = 26;
    private int givenNumber;


    public ExcelSheetColumnNumber(int givenNumber) {
        super("Excel Sheet Column Number");
        this.givenNumber = givenNumber;
    }



    /**
     * Making use of the remainder plus one to form the column title.
     * Continue to perform mod if the quotient is more than zero after divided by 26.
     */
    @Override
    protected String execute() {
        int remainder = 0;
        StringBuilder remainderPlusOne = new StringBuilder();
        System.out.printf("Given: %s%n", givenNumber);

        while (givenNumber > 0) {
            remainder = (givenNumber - 1) % DIVISOR;
            givenNumber = (givenNumber - 1) / DIVISOR;

            /**
             * In order to print out the column title in alphabetical order,
             * I'll have to do LIFO by always inserting the latest remainder in index zero.
             */
            remainderPlusOne.insert(0, (char) (remainder + 'A'));
        }

        if (remainderPlusOne.length() > 0) {
            return remainderPlusOne.toString();
        }
        else {
            return "N/A";
        }
    }
}
