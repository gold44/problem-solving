package me.patrick.problems;

import me.patrick.Solution;

import java.util.HashSet;
import java.util.Set;

public class CapturingStones extends Solution {
    private int gridNumber;
    private String givenInput;
    private int[][] boardGrid;


    public CapturingStones(int gridNumber, String givenInput) {
        super("Capturing Stones");

        this.gridNumber = gridNumber;
        this.givenInput = givenInput;
        boardGrid = new int[gridNumber][gridNumber];
    }


    private void setupTestData() {
        String[] input = givenInput.split("\\n");

        // Go by ROW
        for (int j = 0; j < input.length; j++) {
            char[] dataX = input[j].toCharArray();
            // For each ROW, go by COLUMN
            for (int i = 0; i < dataX.length; i++) {
                boardGrid[i][j] = Integer.valueOf(String.valueOf(dataX[i]));
            }
        }
    }


    @Override protected String execute() {
        setupTestData();
        Set<String> numberOfWhiteStones = new HashSet();
        System.out.println("Sample Data:");

        for (int y = 0; y < gridNumber; y++) {
            for (int x = 0; x < gridNumber; x++) {

                System.out.printf("%d ", boardGrid[x][y]);

                if (boardGrid[x][y] == 1) {
                    int top = y - 1;
                    int bottom = y + 1;
                    int left = x - 1;
                    int right = x + 1;

                    if (top >= 0 && boardGrid[x][top] == 0) {
                        numberOfWhiteStones.add(x + "" + top);
                    }

                    if (bottom < gridNumber && boardGrid[x][bottom] == 0) {
                        numberOfWhiteStones.add(x + "" + bottom);
                    }

                    if (left >= 0 && boardGrid[left][y] == 0) {
                        numberOfWhiteStones.add(left + "" + y);
                    }

                    if (right < gridNumber && boardGrid[right][y] == 0) {
                        numberOfWhiteStones.add(right + "" + y);
                    }
                }
            }
            System.out.println();
        }
        return String.valueOf(numberOfWhiteStones.size());
    }
}
