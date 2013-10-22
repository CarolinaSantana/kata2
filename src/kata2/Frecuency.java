package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Frecuency {
    private int[] vector;
    private static HashMap<Integer, Integer> map = new HashMap<>();

    public int ocurrence () {
        for (int i = 0; i < vector.length; i++) {
            int key;
            key = vector[i];
            if (map.containsKey(key))
                map.put(key, map.get(key)+1);
            else
                map.put(key, 1);
        }                   
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        String ocurrence;
        while (iterator.hasNext()) {
            Map.Entry<Integer,Integer> entry = iterator.next();
            String aux;
            if (entry.getValue() > 1)
                aux = "veces";
            else
                aux = "vez";
            System.out.println("El número " 
                               + entry.getKey() + " aparece "
                               + entry.getValue() + " " + aux);
        }
        return 0;
    }

    public Frecuency(int[] vector) { 
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public static HashMap<Integer, Integer> getMap() {
        return map;
    }
    
}
