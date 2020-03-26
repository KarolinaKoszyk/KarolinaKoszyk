package zad2;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void testy(){
        Solution sol = new Solution(new ArrayList<Integer>());

        List<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(3);
        b.add(6);
        b.add(4);
        b.add(1);
        b.add(2);

        System.out.println(b);

        sol.solution(b);

        List<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);

        System.out.println(c);

        sol.solution(c);



        List<Integer> d = new ArrayList<Integer>();
        d.add(1);
        d.add(-5);
        d.add(40);
        d.add(0);
        d.add(-2);
        d.add(2);

        System.out.println(d);

        sol.solution(d);

        List<Integer> e = new ArrayList<Integer>();
        e.add(2);
        e.add(-5);
        System.out.println(e);

        sol.solution(e);

        List<Integer> f = new ArrayList<Integer>();
        f.add(2);
        f.add(5);
        f.add(10);
        f.add(3);
        System.out.println(f);

        sol.solution(f);


    }
}
