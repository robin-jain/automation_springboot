package JavaPrograms110;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateInList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(6);
        arrayList= (ArrayList<Integer>) arrayList.stream().distinct().collect(Collectors.toList());
       String result=arrayList.stream().distinct().map(String::valueOf).collect(Collectors.joining(": "));
        System.out.println(arrayList);
        System.out.println(result);
    }
}
