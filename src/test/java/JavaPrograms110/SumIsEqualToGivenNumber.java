package JavaPrograms110;

import java.util.Arrays;

public class SumIsEqualToGivenNumber {


    public static void sumIsEqualToGivenNumber(int [] intArray, int sum){


        int j=intArray.length-1;
        int i=0;

        Arrays.sort(intArray);
     while (i<j){
         if(intArray[i]+intArray[j]==sum){
             System.out.println("pair is 1st : "+intArray[i]+" 2nd  : "+intArray[j]+"  Sum is : "+sum);
             i++;
             j--;

         } else if (intArray[i]+intArray[j]<sum) {
             i++;
         } else if (intArray[i]+intArray[j]>sum) {
             j--;

         }
     }


    }

    public static void main(String[] args) {
        sumIsEqualToGivenNumber(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
    }
}
