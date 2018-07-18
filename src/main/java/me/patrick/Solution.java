package me.patrick;

public abstract class Solution {
    final String PROBLEM_ALGORITHM_NAME;


    public Solution(String name) {
        PROBLEM_ALGORITHM_NAME = name;
    }


    protected abstract String execute();


    public void printAnswer() {

        System.out.println("__[[ " + PROBLEM_ALGORITHM_NAME + " ]]__");
        System.out.printf("Answer: %s%n", execute());
        System.out.println("===================================================================================================");
        System.out.println();
    }
}
