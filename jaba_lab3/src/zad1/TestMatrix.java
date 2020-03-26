package zad1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMatrix {

    @Test
    public void test_CreateEmpty() {
        Matrix A;
    }
    @Test
    public void test_CreateFromTable() {
        Matrix A = new Matrix(new int[][]{ { 1, 2 }, { 3, 4 } });
    }
    @Test
    public void test_SumInteger() {
        Matrix A = new Matrix(new int[][]{ { 1, 2 }, { 3, 4 } });
        Matrix B = new Matrix(new int[][]{ { 1, 2 }, { 3, 4 } });
        Matrix C = new Matrix(new int[][]{ { 2, 4 }, { 6, 8 } });
        assertTrue(Matrix.Equal(Matrix.Sum(A,B), C));
    }
}
