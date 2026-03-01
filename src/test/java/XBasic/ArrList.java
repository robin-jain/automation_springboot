package XBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrList {


    public static void main(String[] args) {
        String [] strings={"22","222","22","22222"};
        ArrayList <String> alString= new ArrayList<>();
        ArrayList <String> baseString= new ArrayList<>();
        ArrayList <String> alStringMain= new ArrayList<>(baseString);

        ArrayList <String> alString1= new ArrayList<>(Arrays.asList(strings));

        alString.add("Saraswati");
        alString.add("sssss");
        alString.addAll(Arrays.asList(strings));

        alString.remove(1);
        ArrayList<String> s= (ArrayList<String>) Collections.synchronizedList(alString1);


        Collections.sort(baseString,Collections.reverseOrder());
//        System.out.println(alString);
//        System.out.println(alString1);
        System.out.println(Arrays.stream(alString1.toArray()));
    }
}
