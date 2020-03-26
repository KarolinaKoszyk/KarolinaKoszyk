package zad4;

public class Solution {
    public
    float[] arr;
    float target;
    int[] res = new int[0];

    Solution (float[] arr, float target){
        this.arr = arr;
        this.target = target;
    }


    int[] calculate(float [] arr, float target) throws MyException {
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new MyException();
    }



    int[] solution (float[] arr, float target){
        try {
            res = calculate(arr, target);
        }
        catch (MyException ex) {
            System.out.println("The task has no solution.");
        }

        for ( int g=0; g<res.length; g++) {
            System.out.println(res[g]);
        }
        return res;
    }
}