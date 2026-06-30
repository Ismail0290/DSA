class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);
        if(numRows == 1){
            return matrix;
        }
        for(int i = 1; i<numRows; i++){
            matrix.add(new ArrayList<>());
            matrix.get(i).add(1);
            for(int j = 0; j<i-1; j++){
                matrix.get(i).add(matrix.get(i-1).get(j) + matrix.get(i-1).get(j+1));
            }
            matrix.get(i).add(1);
        }
        return matrix;
    }
}
// 1 = 0
// 2 = 1
// 