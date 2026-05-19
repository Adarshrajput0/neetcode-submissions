class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        if(arr[0][0] == 1) return 0;
        arr[0][0] =1;
        for(int j=1;j<m;j++){
            if(arr[0][j] == 0 && arr[0][j-1] == 1) arr[0][j] =1;
            else arr[0][j] = 0;
        }

        for(int i=1;i<n;i++){
            if(arr[i][0] == 0 && arr[i-1][0]== 1) arr[i][0] = 1;
            else arr[i][0] =0;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j] == 1) arr[i][j] =0;
                else arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }
}