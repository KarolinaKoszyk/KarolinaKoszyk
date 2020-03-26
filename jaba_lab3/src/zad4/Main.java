package zad4;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        float[] arr = {11,2,15,7};
        float target = 9;

        Solution sol = new Solution(arr, target);
        System.out.println("[11,2,15,7], 9");
        sol.solution(arr, target);


        System.out.print("To go to the tests enter some number: ");
        scanner.nextInt();

        Tests test = new Tests();
        test.testy();

    }
}
