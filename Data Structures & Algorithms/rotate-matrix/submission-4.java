class Solution {
    public void rotate(int[][] arr) {
        int row = arr.length;
        int colm = arr[0].length;

        for(int i =0;i<row;i++){
            for(int j =0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0;i<row;i++){
            int stColm = 0;
            int endColm = arr[0].length - 1;

            while( stColm < endColm){
                int temp = arr[i][stColm];
                arr[i][stColm] = arr[i][endColm];
                arr[i][endColm] = temp;
                stColm++;
                endColm--;
            }
        }
    }
}
