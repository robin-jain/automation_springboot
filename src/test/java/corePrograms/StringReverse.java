package corePrograms;

public class StringReverse {
    



public  static void  reverseString(){
    String str="Ruchi";
    String revStr="";
    for(int i=str.length()-1; i>=0;i--){
        revStr=revStr+str.charAt(i);
        System.out.println(revStr);
    }
    System.out.println(revStr);
}
    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }
        System.out.println(recursiveMethod(str.substring(1)) + str.charAt(0));
        return recursiveMethod(str.substring(1))  + str.charAt(0);
    }


    public static void main(String[] args) {
        StringReverse stringReverse= new StringReverse();
//        stringReverse.reverseString();
        System.out.println(recursiveMethod("Done"));

    }


//Windsurf: Your IDE and extension versions are too old. Update your IDE to 2022.3+ and install the latest extension. For help, contact us at https://windsurf.com/support
}
