import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class FulfillmentCenter {

    public String nazwa_magazynu;
    public List<Item> lista_p = new ArrayList<>();
    public double max_masa;

    FulfillmentCenter(String nazwa_magazynu, List<Item> lista_p, double max_masa) {
        this.nazwa_magazynu = nazwa_magazynu;
        this.lista_p = lista_p;
        this.max_masa = max_masa;
    }

    int searchId(Item produkt) {
        for (int i = 0; i < lista_p.size(); i++) {
            if (lista_p.get(i).nazwa.equals(produkt.nazwa)) {
                return i; //jesli jest to zwracam id
            }
        }
        return -1; //jesli nie ma
    }

    void addProduct(Item produkt) {
        double akt_masa = 0;
        for (Item produkt2 : lista_p) { //zliczanie calej masy
            akt_masa += (produkt2.masa * produkt2.ilosc);
        }
        akt_masa+=(produkt.masa*produkt.ilosc);

        if (akt_masa > max_masa) {
            System.err.println("Magazyn pelny, przekroczony limit");
            return;
        }
        int i = searchId(produkt);
        if (i == -1) {
            lista_p.add(produkt); //jesli takiego nie ma to dodaje
        } else {
            lista_p.get(i).ilosc += produkt.ilosc; //jesli taki jest to sumuje
        }
    }


    int getProduct(Item produkt) {  //zmniejsza ilosc o 1
        int i = searchId(produkt);

        if (i == -1) {
            System.out.println("Nie ma takiego");
            return 0;
        } else {
            if (lista_p.get(i).ilosc > 1) {
                lista_p.get(i).ilosc -= 1;
            } else {
                lista_p.remove(i);
            }
        }
        return 1;
    }

    int removeProduct(Item produkt){
        int i = searchId(produkt);

        if(i==-1){
            System.out.println("Nie ma takiego");
            return 0;
        }
        lista_p.remove(i);
        return 1;
    }

    Item search(String nazwa) { //zwraca produkt o podanej nazwie
        Comparator comparator = new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return i2.compareTo(i1);
            }
        };

        int id = Collections.binarySearch(lista_p, new Item(nazwa),comparator);
        return lista_p.get(id);

    }

    List<Item> searchPartial(String partNazwa)
    {
        List<Item> partList = new ArrayList<Item>();
        for (int i=0; i<lista_p.size(); i++)
        {
            if(lista_p.get(i).nazwa.contains(partNazwa))
            {
                partList.add(lista_p.get(i));
            }
        }

        return partList;
    }

    int countByCondition(ItemCondition stan) //ilosc produktow o danym stanie
    {
        int stan_ilosc=0;
        for(int i=0;i<lista_p.size(); i++)
        {
            if(lista_p.get(i).stan.equals(stan))
            {
                stan_ilosc+=lista_p.get(i).ilosc;
            }
        }
        return stan_ilosc;
    }

    void summary()
    {
        System.out.println("Informacje o wszystkich produktach: ");
        for(int i=0;i<lista_p.size(); i++)
        {
            lista_p.get(i).print();
        }
    }

    List<Item> sortByName()
    {
        List<Item> list2 = new ArrayList<Item>();
        list2 = lista_p;
        Collections.sort(list2);

        return list2;
    }

    List<Item> sortByAmount()
    {
        List<Item> list2 = new ArrayList<Item>();
        list2 = lista_p;

        Collections.sort(list2, new myComparator());
        return list2;
    }


    Item max()
    {

        return Collections.max(lista_p, new Comparator<Item>()
                {
                    @Override
                    public int compare(Item p1, Item p2)
                    {
                        return p1.ilosc - p2.ilosc;
                    }
                }
        );
    }

    private class myComparator implements Comparator<Item>
    {
        @Override
        public int compare(Item p1, Item p2)
        {
            //jesli jest wiecej p2 niz p1 to wyrzuci
            return p2.ilosc - p1.ilosc;
        }
    };
}



















