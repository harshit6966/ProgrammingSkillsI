import java.util.Arrays;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat == null || mat.length == 0 || mat[0] == null || mat[0].length == 0) {
            return mat;
        }

        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c) {
            return mat;
        }

        int[][] res = new int[r][c];
        for(int i=0; i<m*n; i++) {
            int row = i/n;
            int col = i%n;
            int newRow = i/c;
            int newCol = i%c;

            res[newRow][newCol] = mat[row][col];
        }
        return res;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix rm = new ReshapeTheMatrix();
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.deepToString(rm.matrixReshape(mat, r, c)));
    }
}
