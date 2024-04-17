package dsalearn.linearsearch;

public class LinearSearchLeetCodeProblems {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(arr));

    }

    //https://leetcode.com/problems/richest-customer-wealth/description/1672
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
