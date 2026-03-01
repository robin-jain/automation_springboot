package JavaPrograms110;

import java.util.*;

public class ContractTestingDoubt {

    public static void main(String[] args) {
        HashMap<Object, Object> map=new HashMap<>();
        map.put("asas","asas");
        map.put(1,11);

        System.out.println(map);
        int [] a ={1,2,6,3,3,7};
        ArrayList<Object> al=new ArrayList<>();
        ArrayList<Object> al1=new ArrayList<>(List.of(a));
        Collections.sort(al1,Collections.reverseOrder());

        al.add("ssds");
        al.add(11);

        System.out.println(al);
Object[] arrsy =al.toArray();

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
//        Arrays.toString()
    }
}
