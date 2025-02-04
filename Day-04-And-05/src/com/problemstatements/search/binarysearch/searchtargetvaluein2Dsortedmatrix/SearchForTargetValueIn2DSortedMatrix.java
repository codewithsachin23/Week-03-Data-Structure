package com.problemstatements.search.binarysearch.searchtargetvaluein2Dsortedmatrix;

public class SearchForTargetValueIn2DSortedMatrix {

    public static boolean searchIn2D(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        int left = 0, right = numRows * numColumns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert mid to row and column
            int row = mid / numColumns;
            int col = mid % numColumns;

            // Compare the middle element with the target
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target1 = 9;  // Test case 1 (Target is present)
        System.out.println("Test case 1 (Target 5): " + searchIn2D(matrix1, target1));  // Should return true

        // Test case 2 (Target is not present)
        int target2 = 20;  // Target not in matrix
        System.out.println("Test case 2 (Target 20): " + searchIn2D(matrix1, target2));  // Should return false
    }
}
