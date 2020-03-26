package zad5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sort s = new Sort();
        int n = 100000, l=300, r=6000, l1=60, r1=8000;
        int[] arr = new int[n];

        int[] arrRnd = s.makeArrRnd(arr,n);
        int[] arrOpt = s.makeArrOptimistic(arr,n);
        int[] arrPes = s.makeArrPesymistic(arr,n);


        long tStart = System.currentTimeMillis();
        // uruchom sortowanie TU


        //s.bubbleSort(arrOpt);                     // O(n^2)
        //s.bubbleSort(arrPes);                     // O(n^2)
        //s.bubbleSort(arrRnd);                     // O(n^2)

        //s.insertionSort(arrOpt);                  // O(n)
        //s.insertionSort(arrPes);                  // O(n^2)
        //s.insertionSort(arrRnd);                  // O(n^2)

        //s.mergeSort(arrOpt,0,n-1);                // O(nlogn)
        //s.mergeSort(arrPes,0,n-1);                // O(n x logn)
        //s.mergeSort(arrRnd,0,n-1);                // O(nlogn)

        //s.quickSort(arrOpt,l,r);                  // O(nlogn)
        //s.quickSort(arrPes,l1,r1);                // O(n^2)
        //s.quickSort(arrRnd,l,r);                  // O(nlogn)


        //s.shellSort(arrOpt);                      // O(n^2)
        //s.shellSort(arrPes);                      // O(n^2)
        //s.shellSort(arrRnd);                      // O(n^2)


        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println(elapsedSeconds);
    }
}
