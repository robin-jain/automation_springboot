package JavaPrograms110;

import java.util.concurrent.Callable;

public class RemoveWhiteSpace {


    public static void removeSpace(String str){

        String str1=str.replaceAll("\\s+","");

        System.out.println("String after replacement "+str1);

    }

    public static void removeSpaceOtherMth(String str){
            char [] charArray=str.toCharArray();
            String newString="";
            for (int i=0;i<charArray.length;i++){
                if (charArray[i]!=' ' && charArray[i]!='\t'){
                    newString=newString+charArray[i];
                }
            }

        System.out.println("removeSpaceOtherMth :"+newString);


    }

    public static void main(String[] args) {
        removeSpace("sds   dssd sdsd     sdsd");
        removeSpaceOtherMth("sds   dssd sdsd     sdsd");

    }
}
