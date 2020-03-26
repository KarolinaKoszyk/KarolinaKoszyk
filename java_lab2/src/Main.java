import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Dodawanie prodoktow do listy obiektu FulfillmentCenter");
        FulfillmentCenter fc = new FulfillmentCenter("magazyn1",new ArrayList<Item>(),100);

        fc.addProduct(new Item("p1",ItemCondition.NEW,3,3));
        fc.addProduct(new Item("p2",ItemCondition.REFURBISHED,8,4));
        fc.addProduct(new Item("p3",ItemCondition.USED,10,5));

        fc.summary();

        scanner.nextLine();
        fc.addProduct(new Item("p4",ItemCondition.NEW,100,2)); //przekroczenie
        fc.summary();


        scanner.nextLine();
        fc.getProduct(new Item("p1",ItemCondition.NEW,3,3)); //zmniejszenie
        fc.summary();

        scanner.nextLine();
        fc.removeProduct(new Item("p1",ItemCondition.NEW,1,3)); //usuwanie
        fc.summary();

        scanner.nextLine();
        fc.search("p2").print(); //zwraca nazwe produktu2

        scanner.nextLine();
        fc.countByCondition(ItemCondition.NEW); // ilość produktów o danym stanie

        scanner.nextLine(); //sortowanie
        fc.sortByName();
        fc.summary();

        scanner.nextLine(); //sortowanie po ilosci
        fc.sortByAmount();
        fc.summary();

        scanner.nextLine(); //wartosc max
        fc.max().print();

        //Obiekt FulfillmentContainer
        FulfillmentCenterContainer fcc=new FulfillmentCenterContainer();
        fcc.addCenter("k1",5);  //dodawanie
        fcc.addCenter("k2",10);
        fcc.addCenter("k3",20);
        fcc.addCenter("k4",100);
        fcc.summary();

        scanner.nextLine();
        fcc.removeCenter("k1"); //usuwanie
        fcc.summary();

        scanner.nextLine();
        fcc.map.get("k4").addProduct(new Item("p1",ItemCondition.NEW,1,2)); //dodanie produktow
        fcc.map.get("k4").addProduct(new Item("p2",ItemCondition.NEW,10,3));
        fcc.summary();


    }


}
