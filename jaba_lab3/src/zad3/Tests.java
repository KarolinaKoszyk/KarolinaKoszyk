package zad3;

public class Tests {
    public static void testy(){
        String a = "kloda";
        String b = "daklodakloda";
        Substring sub = new Substring(a,b);
        sub.substring(a,b);

        String a1 = "song";
        String b1 = "songsongsong";
        Substring sub1 = new Substring(a1,b1);
        sub1.substring(a1,b1);

        String a2 = "kworkworkworkwo";
        String b2 = "work";
        Substring sub2 = new Substring(a2,b2);
        sub2.substring(a2,b2);

        String a3 = "AbcD";
        String b3 = "cDAbcDAb";
        Substring sub3 = new Substring(a3,b3);
        sub3.substring(a3,b3);

        String a4 = "ookso";
        String b4 = "okbokb";
        Substring sub4 = new Substring(a4,b4);
        sub4.substring(a4,b4);

        String a5 = "mes";
        String b5 = "sm";
        Substring sub5 = new Substring(a5,b5);
        sub5.substring(a5,b5);
    }
}
