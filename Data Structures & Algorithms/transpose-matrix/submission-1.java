class Solution {
    public int[][] transpose(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int [][] newArray = new int [m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newArray [j][i] = arr[i][j];
            }
        }
        return newArray;
    }
}