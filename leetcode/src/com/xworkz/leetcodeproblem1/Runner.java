package com.xworkz.leetcodeproblem1;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numbers = {2, 7, 11, 15};
        int goal = 9;

        int[] result = solution.twoSum(numbers, goal);
            System.out.println("Input Array:" + Arrays.toString(numbers));
            System.out.println("Target:" + goal);
            System.out.println("Result Indices:" + Arrays.toString(result));
        }
}
