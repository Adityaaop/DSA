class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int row1 = a[0], col1 = a[1], row2 = b[0], col2 = b[1];
            int value1 = matrix[row1][col1];
            int value2 = matrix[row2][col2];
            return value1 - value2;
        });
        for(int i = 0; i < matrix.length; i++) {
            pq.add(new int[]{i, 0});
        }
        while(k-- > 1) {
            int[] currEleIdx = pq.remove();
            int currEleRow = currEleIdx[0];
            int currEleCol = currEleIdx[1];
            currEleCol++;
            if(currEleCol < matrix[0].length) {
                pq.add(new int[]{currEleRow, currEleCol});
            }
        }
        int[] ansIdx = pq.remove();
        int ansRow = ansIdx[0];
        int ansCol = ansIdx[1];
        return matrix[ansRow][ansCol];
    }
}