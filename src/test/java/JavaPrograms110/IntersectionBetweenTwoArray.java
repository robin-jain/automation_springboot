package JavaPrograms110;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionBetweenTwoArray {


    public static void findInterSection(int []s1 ,int []s2 ){
        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};
        Set <Integer> hashset=new HashSet<>();
        Set <Integer> hashset1=new HashSet<>(Arrays.asList(i1));
        Set <Integer> hashset2=new HashSet<>(Arrays.asList(i1));
        hashset1.retainAll(hashset2);
        for (int i=0;i<s1.length;i++){
            for (int j=0;j<s2.length;j++){

                if (s1[i]==s2[j]){
                    hashset.add(s1[i]);
                }
            }

        }
        hashset.stream().forEach(System.out::println);

        System.out.println(hashset);
    }

    public static void main(String[] args) {
        int []s1={1,2,3,4,5,5,6,7};
        int []s2={11,6,3,5,5,5,6,7};
        findInterSection(s1,s2);
    }
}
