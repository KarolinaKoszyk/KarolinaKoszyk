package zad2;

import zad4.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution {
    public
    List<Integer> a = new ArrayList<Integer>();

    Solution(List<Integer> a) {
        this.a = a;
    }

    int solution(List<Integer> a) {

        List<Integer> list = new ArrayList<Integer>();
        list = a;


        try {
            if (list.size() > 100000 || list.isEmpty() == true){
                throw new MyException();
            }
        }
        catch (MyException ex) {
            System.out.println("The list must not be empty and not larger than 100000!");
            return 0;
        }


        Collections.sort(list);
        int res=0;

        if (list.get(0) > 1){
            res = 1;
        }
        else {
            for (int i = 1; i < list.size(); i++) {
                int smaller = list.get(i - 1);
                int bigger = list.get(i);
                int possible_sollution = smaller + 1;

                if (possible_sollution == bigger) {
                    continue;
                }
                if (possible_sollution < 1) {
                    continue;
                }
                res = possible_sollution;
            }
        }

        if (res == 0){
            int i = list.size();
            res = Math.max(list.get(i-2)+2 , 1);
        }

        System.out.println(res);
        return res;
    }

}