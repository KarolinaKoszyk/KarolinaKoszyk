package zad1;

public class Matrix
{
    private int M = 0;             // number of rows
    private int N = 0;             // number of columns
    private int [][] data = null;   // M-by-N array

    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new int[M][N];
    }

    // create matrix based on 2d array
    public Matrix(int[][] refData) {
        M = refData.length;
        N = refData[0].length;
        data = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                data[i][j] = refData[i][j];
    }

    public static Matrix Sum(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M, A.N);
        for (int i = 0; i < A.M; i++) {
            for (int j = 0; j < A.N; j++) {
                C.data[i][j] = A.data[i][j] + B.data[i][j];
            }
        }
        return C;
    }

    public static boolean Equal(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) return false;
        for (int i = 0; i < A.M; i++) {
            for (int j = 0; j < A.N; j++) {
                if (A.data[i][j] != B.data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}