
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;

            // Find minimum element in the row
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // Check whether it is maximum in its column
            boolean isLucky = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(min);
            }
        }

        return result;
    }
}
