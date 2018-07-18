package me.patrick.problems;

import me.patrick.Solution;

import java.util.HashSet;
import java.util.Set;

public class CapturingStones extends Solution {
    private int gridNumber;
    private String givenInput;
    private int[][] boardGrid;
    private static final int[] ROW = { -1, 1, 0, 0 };
    private static final int[] COL = { 0, 0, -1, 1 };


    public CapturingStones(int gridNumber, String givenInput) {
        super("Capturing Stones");

        this.gridNumber = gridNumber;
        this.givenInput = givenInput;
        boardGrid = new int[gridNumber][gridNumber];
    }


    private void setupTestData() {
        char[] inputs = givenInput.toCharArray();

        System.out.println("Sample Data:");
        for (int x = 0; x < gridNumber; x++) {
            for (int y = 0; y < gridNumber; y++) {
                boardGrid[x][y] = Integer.valueOf(String.valueOf(inputs[x * gridNumber + y]));
                System.out.printf("%d ", boardGrid[x][y]);
            }
            System.out.println();
        }
    }


    private String solutionFirstAttempt() {
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


    private String solutionBetter() {
        int numberOfWhiteStones = 0;

        for (int x = 0; x < gridNumber; x++) {
            for (int y = 0; y < gridNumber; y++) {
                if (boardGrid[x][y] == 1) {
                    // Found the black stone, perform the check on its 4 surrounding
                    for (int z = 0; z < 4; z++) {
                        int r = x + ROW[z];
                        int c = y + COL[z];

                        if (r < 0 || r >= gridNumber || c < 0 || c >= gridNumber) {
                            continue;
                        }
                        // if any of the 4 surrounding do not have black stone, count it.
                        if (boardGrid[r][c] == 0) {
                            // Do a marking on grid that has been occupy by white stone, so that it won't be counted again in future.
                            boardGrid[r][c] = -1;
                            numberOfWhiteStones++;
                        }
                    }
                }
            }
        }
        return String.valueOf(numberOfWhiteStones);
    }


    @Override protected String execute() {
        setupTestData();
        return solutionBetter();
    }
}
