package xcollections;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class HashMp {


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        TreeMap<Integer, String> map1 = new TreeMap<>();
        Hashtable<Integer, String> map2 = new Hashtable<>();
        LinkedHashMap<Integer, String> map3 = new LinkedHashMap();

        Map<Integer, String> map4 = new HashMap<>();


        map.put(1, "Mani");
        map.put(2, "Mani");
        map.put(3, "Mani");
        map.put(4, "Mani");
        map.put(null, null);

        System.out.println(map);


        for (String i : map.values()) {
            System.out.println("Value is " + i);
        }

    }
}
