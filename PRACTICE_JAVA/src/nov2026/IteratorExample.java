package nov2026;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorExample {

    public static void main(String[] args) {
        TreeMap<Integer,String> al = new TreeMap<>();
        al.put(101,"A");
        al.put(102,"B");
        al.put(103,"C");
        al.put(104,"D");
        al.put(105,"E");
    //we have to convert  two dimentional to one dimentional.
        //  public Set<Map$Entry<K, V>> entrySet();
        Set<Map.Entry<Integer,String>> s=al.entrySet();
        Iterator<Map.Entry<Integer,String>> i =s.iterator();
      for (Map.Entry<Integer,String> entry : s) {
        System.out.println(s);
      }
       
    }
}