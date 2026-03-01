package JavaPrograms110;

import java.util.Arrays;

public class SeparateZero {


    public static void separate(int[] intArray) {


        int counter=0;

        for (int i = 0; i < intArray.length; i++) {
               if (intArray[i] != 0) {

                   intArray[counter]=intArray[i];
                   counter++;

            }

        }
        while (counter<intArray.length){
            intArray[counter]=0;
            counter++;
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void separateReverseZero(int[] intArray) {


        int counter=intArray.length-1;

        for (int i = intArray.length-1; i>=0  ; i--) {
            if (intArray[i] != 0) {

                intArray[counter]=intArray[i];
                counter--;

            }

        }
        while (counter>=0){
            intArray[counter]=0;
            counter--;
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void main(String[] args) {
        separate(new int[] {0,12, 0, 7, 0, 8, 0, 3});
        separateReverseZero(new int[] {0,12, 0, 7, 0, 8, 0, 3});

    }
}
