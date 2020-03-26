package zad2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Solution sol = new Solution(new ArrayList<Integer>());

        List<Integer> a = new ArrayList<Integer>();
        a.add(-1);
        a.add(-3);
        System.out.println(a);

        sol.solution(a);


        System.out.print("To go to the tests enter some number: ");
        scanner.nextInt();

        Tests test = new Tests();
        test.testy();
    }
}