package JavaPrograms110;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class SecondLargestInArray {

    public static void bruteForceMethod( int [] intArray){

        int firstLargest=0;
        int secondLargest=0;


        if (intArray[0]>intArray[1]){
            firstLargest=intArray[0];
            secondLargest=intArray[1];
        }else {
            firstLargest=intArray[1];
            secondLargest=intArray[0];
        }


        for (int i=2;i<intArray.length;i++){
            if (intArray[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=intArray[i];
            }else if(intArray[i]<firstLargest && intArray[i]>secondLargest){
                secondLargest=intArray[i];

            }
        }
        System.out.println("Second largest is : "+secondLargest);
    }

    public static void main(String[] args) {
        int [] intArray={1,2,3,4,5,6,6,89,7,23};
        bruteForceMethod(intArray);
        Arrays.sort(intArray);
        System.out.println(intArray[intArray.length-2]);

     Optional<Integer> m =Arrays.stream(intArray).distinct().boxed().sorted((a, b)->(b-a)).skip(1).findFirst();
        System.out.println("Second largest : "+ m );



    }
}
