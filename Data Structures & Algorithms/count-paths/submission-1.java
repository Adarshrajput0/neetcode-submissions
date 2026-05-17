class Solution {
    public int uniquePaths(int m, int n) {
        int [][] arr = new int[n][m];
        
// column me 1 bhar de 
        for(int j=0;j<m;j++){
            arr[0][j] = 1;
        }
//row me 1 bhar de 
        for(int i=0;i<n;i++){
            arr[i][0] = 1;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }
}
