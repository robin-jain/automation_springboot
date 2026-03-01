package JavaPrograms110;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementInArray {

    public static void findDuplicateInArray(int[] arrayInt) {

        Map<Integer, Integer> intMap = new HashMap<>();

        for (int i = 0; i < arrayInt.length; i++) {
            intMap.put(arrayInt[i], intMap.getOrDefault(arrayInt[i], 0) + 1);
        }
        System.out.println(intMap);

        Set<Integer> intSet = intMap.keySet();

        for (Integer in : intSet) {
            if (intMap.get(in) > 1) {
                System.out.println("Key is : "+in+" Value is "+intMap.get(in));
            }

        }
    }


    public static void findDuplicateBySteam( int [] num){
        Integer [] arrayInt = {1, 2, 5, 3, 4, 5, 6};
        Set<Integer> uniqueElement=new HashSet<>();

        Set<Integer> duplicate=Arrays.stream(num).filter(i->!uniqueElement.add(i)).boxed().collect(Collectors.toSet());
        Set<Integer> duplicateElement= Arrays.stream(num)
                .filter(i->!uniqueElement.add(i)).boxed().collect(Collectors.toSet());

        Set<Integer> uniqueElement1=Arrays.stream(num).boxed().collect(Collectors.toSet());

        List<Integer> ls= new ArrayList<>(List.of(arrayInt));
        Set<Integer> uniq=new HashSet<>(List.of(arrayInt));



        //        System.out.println(duplicateElement);
        System.out.println(uniqueElement);
    }
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 5, 3, 4, 5, 6};
//        findDuplicateInArray(arrayInt);
        findDuplicateBySteam(arrayInt);
    }
}
