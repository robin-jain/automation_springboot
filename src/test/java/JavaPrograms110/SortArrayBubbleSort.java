package JavaPrograms110;

import java.util.Arrays;

public class SortArrayBubbleSort {


    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 2};
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
//                    inner break  ;
                }
            }

//             No swaps → already sorted
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
