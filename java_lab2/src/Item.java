public class Item implements Comparable<Item> {

    String nazwa;
    ItemCondition stan;
    double masa;
    int ilosc;

    Item(String nazwa)
    {
        this.nazwa=nazwa;
        this.stan = ItemCondition.NEW;
        this.masa = 1;
        this.ilosc = 1;
    }

    Item(String nazwa, ItemCondition stan, double masa, int ilosc){
        this.nazwa=nazwa;
        this.stan=stan;
        this.masa=masa;
        if(ilosc<0){
            System.out.println("Nie moze byc mniejszy od 0");
            this.ilosc=0;
        }
        else
            this.ilosc=ilosc;
    }

    void print(){
        System.out.println("Produkt: "+this.nazwa);
        System.out.println("Stan: "+this.stan);
        System.out.println("Masa: "+this.masa);
        System.out.println("Ilosc: "+this.ilosc);
    }

    public int compareTo(Item i){
        return nazwa.compareTo(i.nazwa);
    }
}

