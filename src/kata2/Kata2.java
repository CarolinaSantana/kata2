package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] v1 = new int[]{1, 2, 2, 3, 4, 3, 3};
        Frecuency frec = new Frecuency (v1);        
        System.out.println(frec.Ocurrence());
    }
    
}
  
