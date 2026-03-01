package xcollections;

import java.util.ArrayList;
import java.util.List;

public class lst {


    public static void main(String[] args) {
        String [] str={"2","2","2","3","44"};

        ArrayList <String> al= new ArrayList<>(List.of(str));

//        al.stream().forEach(System.out::print);
//         al.forEach(a-> System.out.println(a));

        ArrayList<String> m = new ArrayList<>(al);
       m.addAll(al);

        System.out.println(al);


    }
}
