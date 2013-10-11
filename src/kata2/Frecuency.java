package kata2;

import java.util.HashMap;


public class Frecuency {
    private int[] vector;
    private static HashMap<Integer, Integer> map = new HashMap<>();

    public Frecuency() {
        for (int i = 0; i < vector.length; i++) {
            map.put(vector[i], 0);
        }
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
