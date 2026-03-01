package JavaPrograms110;

public class ReversingStringWithPreservingPosition {


    public static void reverseWithPosition(String inputString){

        char[] inputChar=inputString.toCharArray();
        char[] resultChar=new char[inputChar.length];

        for (int i=0;i<inputChar.length-1;i++){

            if (inputChar[i]==' '){
                resultChar[i]=' ';
            }
        }

        int j=resultChar.length-1;

        for (int i=0;i<inputChar.length-1;i++){

            if (inputChar[i]!=' '){
                if (resultChar[j]==' '){
                    j--;
                };
            resultChar[j]=inputChar[i];
            j--;
            }
        }
        System.out.println(inputString+" ---> "+String.valueOf(resultChar));
    }

    public static void main(String[] args) {
        reverseWithPosition("I Am Not String");

        reverseWithPosition("JAVA JSP ANDROID");
    }
}
