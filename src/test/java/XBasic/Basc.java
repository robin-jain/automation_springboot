package XBasic;

import java.util.Arrays;

public class Basc {


    public static void main(String[] args) {
        String [] str={"RAM","RAM1","RAM2","RAM3","RAM4","RAM5","RAM6"};

        System.out.println(Arrays.toString(str));

        int a []=new int[4];
        String s [] =new String[]{"RAM","RAM1","RAM2","RAM3","RAM4","RAM5","RAM6"};
        int len=s.length;



        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
            str[i]="MANI"+i;

            System.out.println(str[i]);
        }
    String print=Arrays.toString(str);
        System.out.println(print);
    }
}
