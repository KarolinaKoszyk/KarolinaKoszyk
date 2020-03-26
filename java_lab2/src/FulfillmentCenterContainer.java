import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;


public class FulfillmentCenterContainer {
    Map<String, FulfillmentCenter> map = new TreeMap<>();


    void addCenter(String name, double max_masa) {
        map.put(name, new FulfillmentCenter(name, new ArrayList<Item>(), max_masa)); //klucz name, masa max_masa

    }

    void removeCenter(String nazwa) {


        map.remove(nazwa);
    }

    List<FulfillmentCenter> findEmpty()
    {
        List<FulfillmentCenter> list2 = new ArrayList<FulfillmentCenter>();

        for(Map.Entry key:map.entrySet())
        {
            if(map.get(key.getKey()).lista_p.size() == 0)
            {
                list2.add(map.get(key.getKey()));
            }

        }
        return list2;
    }

    void summary()
    {

        System.out.println("Zapelnienie magazynow:");
        System.out.println("Nazwa magazynu");
        for(Map.Entry key:map.entrySet())
        {
            if(map.get(key.getKey()).lista_p.size() == 0)
            {
                System.out.println(key.getKey()+"- 0%");
            }
            else
            {
                double akt_masa=0;

                for(Item item: map.get(key.getKey()).lista_p)
                {
                    akt_masa += (item.masa * item.ilosc);
                }

                double procent = (akt_masa / map.get(key.getKey()).max_masa)*100;

                System.out.println(key.getKey()+"-"+procent+"%");
            }

        }

    }
}