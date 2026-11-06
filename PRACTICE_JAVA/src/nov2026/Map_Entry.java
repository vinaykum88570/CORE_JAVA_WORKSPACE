package nov2026;

import java.util.*;

import javax.swing.event.TreeExpansionEvent;

public class Map_Entry {
    public static void main(String[] args) {
        TreeMap<Integer,Float> tm= new TreeMap<>();
        tm.put(101, 50000.0f);
        tm.put(102, 52000.0f);
        tm.put(103, 53000.0f);
        tm.put(104, 54000.0f);
        tm.put(105, 55000.0f);
        tm.put(106, 56000.0f);
        System.out.println(tm);

        Set<Map.Entry<Integer,Float>> s= tm.entrySet();
        Iterator<Map.Entry<Integer,Float>> i=s.iterator();
        while (i.hasNext()) {

            Map.Entry<Integer,Float> me=i.next();
            int x= me.getKey();
            float y= me.getValue();
            System.out.println(x+ " "+y);

           
        }
    }
}
