package JavaPrograms110;

import java.util.Arrays;

public class EqualityOfTwoArray {

    static String []  str1={"ss","sss","ss","ss"};
    static String []  str2={"ss","ss","ss","ss"};


    public static void checkEqualityOfArray(String [] s1,String [] s2){

        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s1.length==s2.length){
            if (Arrays.equals(s1,s2)){
                System.out.println("Array are  equal");
            }
        }else {
            System.out.println("Array are not equal");
        }

    }
    public static void checkEqualityOfArrayByIndex(String [] s1,String [] s2){

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i=0;i<s2.length;i++){
            if(s1[i]!=s2[i]){
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Arrays are Equal");

    }
    public static void main(String[] args) {
        checkEqualityOfArray(str1,str2);
        checkEqualityOfArrayByIndex(str1,str2);
    }

}
