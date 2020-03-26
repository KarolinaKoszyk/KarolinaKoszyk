package zad3;

import zad4.MyException;

public class Substring {
    public
    String a, b;
    int number = 1;

    Substring (String a, String b) {
        this.a = a;
        this.b = b;
    }

    void checking (String a, String b) throws MyException {
        System.out.println(a);

        int l=0;
        for(int i=0; i<b.length(); i++){
            if(!(a.contains(b.substring(i,i+1)))){
                l++;
            }
        }
        if (l>0){
            throw new MyException();
        }
    }

    int substring (String a, String b){
        try {
            checking(a,b);
            while (a.contains(b) == false) {
                a = a + a;
                number++;
            }

            System.out.println(b + "\n" + number + "\n");
            return number;
        }
        catch (MyException ex){
            System.out.println("'b' cannot be a substring 'a'.\n");
            return -1;
        }
    }
}


