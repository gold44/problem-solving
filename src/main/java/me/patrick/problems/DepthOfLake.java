package me.patrick.problems;

import me.patrick.Solution;

public class DepthOfLake extends Solution {
    private int sizeOfGrid;
    private String givenInput;
    private char[][] lakeCell;
    private int depthCount;

    private static final int[] COL = { -1, 1, 0, 0 };
    private static final int[] ROW = { 0, 0, -1, 1 };

    private static final int[] DIAGONAL_COL = { -1, -1, 1, 1 };
    private static final int[] DIAGONAL_ROW = { -1, 1, -1, 1 };


    public DepthOfLake(int sizeOfGrid, String givenInput) {
        super("Depth of Lake");

        this.sizeOfGrid = sizeOfGrid;
        this.givenInput = givenInput;
        lakeCell = new char[sizeOfGrid][sizeOfGrid];
    }


    private void setupTestData() {
        char[] input = givenInput.toCharArray();

        for (int x = 0; x < sizeOfGrid; x++) {
            for (int y = 0; y < sizeOfGrid; y++) {
                lakeCell[x][y] = input[x * sizeOfGrid + y];
                System.out.printf("%s", lakeCell[x][y]);
            }
            System.out.printf("%n");
        }
    }


    @Deprecated
    private String firstAttempt() {

        for (int x = 0; x < sizeOfGrid; x++) {
            for (int y = 0; y < sizeOfGrid; y++) {

                boolean depthOfOne = false;
                if (lakeCell[x][y] == 'W') {
                    for (int z = 0; z < 4; z++) {
                        int c = x + COL[z];
                        int r = y + ROW[z];

                        if (c < 0 || c >= sizeOfGrid || r < 0 || r >= sizeOfGrid || lakeCell[c][r] == 'G') {
                            depthOfOne = true;
                            depthCount += 1;
                            break;
                        }
                    }

                    if (!depthOfOne) {
                        depthCount += 1;

                        for (int z = 0; z < 4; z++) {
                            int c = x + DIAGONAL_COL[z];
                            int r = x + DIAGONAL_ROW[z];

                            if (lakeCell[c][r] == 'W') {
                                depthCount += 1;
                            }
                        }
                    }
                }
            }
        }
        return String.valueOf(depthCount);
    }


    private String secondAttempt() {

        for (int x = 0; x < sizeOfGrid; x++) {
            for (int y = 0; y < sizeOfGrid; y++) {

                if (lakeCell[x][y] == 'W') {
                    depthCount += 1;

                    if (x > 0 && y > 0 && x < sizeOfGrid - 1 && y < sizeOfGrid - 1) {
                        if (lakeCell[x - 1][y] == 'W' && lakeCell[x + 1][y] == 'W' && lakeCell[x][y - 1] == 'W' && lakeCell[x][y + 1] == 'W') {
                            if (lakeCell[x - 1][y - 1] == 'W') {
                                depthCount += 1;
                            }
                            if (lakeCell[x + 1][y - 1] == 'W') {
                                depthCount += 1;
                            }
                            if (lakeCell[x - 1][y + 1] == 'W') {
                                depthCount += 1;
                            }
                            if (lakeCell[x + 1][y + 1] == 'W') {
                                depthCount += 1;
                            }
                        }
                    }
                }
            }
        }

        return String.valueOf(depthCount);
    }


    @Override
    protected String execute() {
        setupTestData();

        return secondAttempt();
    }
}
