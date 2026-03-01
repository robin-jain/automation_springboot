package xcollections;

import java.util.Arrays;
import java.util.HashMap;

public class JavaHashMapProgram
{
    public static void main(String[] args)
    {
        int[] inputArray = {4, 7, 2, 9, 1, 7, 1, 4, 7, 8};

        //Creating an empty elementFrequencyMap with elements as keys and their frequency as values

        HashMap<Integer, Integer> elementFrequencyMap = new HashMap<Integer, Integer>();

        //Iterating each element of inputArray

        for (int i : inputArray)
        {
            //Inserting each element of inputArray into elementFrequencyMap
            //If element is already present, incrementing its count by 1


            elementFrequencyMap.put(i, elementFrequencyMap.getOrDefault(i, 0) + 1);
        }

        //Printing inputArray

        System.out.println("Input Array : "+ Arrays.toString(inputArray));

        System.out.println("===================");
        System.out.println("Element : Frequency");
        System.out.println("===================");

        //Printing elementFrequencyMap

        elementFrequencyMap.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}
