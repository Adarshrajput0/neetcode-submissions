class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int firstrow =0,lastrow = n-1;
        int firstcolm = 0,lastcolm = m-1;

        while(firstcolm <= lastrow && firstcolm <= lastcolm){
            for(int j = firstcolm; j<= lastcolm;j++){
                ans.add(matrix[firstrow][j]);
            }
            firstrow++;
            if(firstrow > lastrow || firstcolm > lastcolm) break;
            for(int i =firstrow; i<= lastrow;i++){
                ans.add(matrix[i][lastcolm]);
            }
            lastcolm--;
            if(firstrow > lastrow || firstcolm > lastcolm) break;
            for(int j =lastcolm;j>=firstcolm;j--){
                ans.add(matrix[lastrow][j]);
            }
            lastrow--;
            if(firstrow > lastrow || firstcolm > lastcolm) break;

            for(int i=lastrow; i>= firstrow;i--){
                ans.add(matrix[i][firstcolm]);
            }
            firstcolm ++;
        }
        return ans;
    }
}
