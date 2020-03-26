package zad4;

import java.util.Scanner;

public class Tests {
    static Scanner scanner = new Scanner(System.in);

    public static void testy(){
        float[] arr = {-5,10,2,3,8,5};
        float target = 5;
        System.out.println("[-5,10,2,3,8,5], 5");
        Solution sol = new Solution(arr, target);
        sol.solution(arr, target);



        float[] arr2 = {-5,10,4,8,2,5};
        float target2 = 5;
        System.out.println("[-5,10,4,8,2,5], 5");
        Solution sol2 = new Solution(arr2, target2);
        sol2.solution(arr2, target2);



        float[] arr3 = {2,1,8};
        float target3 = 4;
        System.out.println("[2,1,8], 4");
        Solution sol3 = new Solution(arr3, target3);
        sol3.solution(arr3, target3);


        float[] arr4 = {2,1,8,6,3,12};
        float target4 = 11;
        System.out.println("[2,1,8,6,3,12], 11");
        Solution sol4 = new Solution(arr4, target4);
        sol4.solution(arr4, target4);


        System.out.print("To make more tests enter 1, to EXIT enter 2.");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("Give the N number: ");
                int n = scanner.nextInt();
                float[] arr5 = new float[n];

                System.out.print("Give the arr numbers: ");

                for(int i=0; i<n; i++){
                    arr5[i] = scanner.nextInt();
                }

                System.out.print("Give the target: ");
                int target5 = scanner.nextInt();

                Solution sol5 = new Solution(arr5, target5);
                sol5.solution(arr5, target5);
                break;

            case 2:
                break;
        }
    }
}
