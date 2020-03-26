package zad3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String a = "abcd";
        String b = "cdabcdab";
        Substring sub = new Substring(a,b);
        sub.substring(a,b);


        System.out.print("To go to the tests enter some number: ");
        scanner.nextInt();

        Tests test = new Tests();
        test.testy();
    }
}
