class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length-1;
        for(int i=0;i<n;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int stcolm = 0;
            int endcolm = arr[0].length-1;
            while(stcolm < endcolm){
                int temp = arr[i][stcolm];
                arr[i][stcolm] = arr[i][endcolm];
                arr[i][endcolm] = temp;
                stcolm++;
                endcolm--;
            }
        }
    }
}
