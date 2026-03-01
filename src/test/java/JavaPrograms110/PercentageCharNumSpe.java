package JavaPrograms110;

public class PercentageCharNumSpe {

    public static void main(String[] args) {

        String str="sds sds dsds 23232434 *^$#";

        int totalLength=str.length();
        int iChar=0;
        int iNum=0;
        int iSpec=0;
        for (char ch:str.toCharArray()){

            if (Character.isLetter(ch)){
                iChar++;
            }

            if(Character.isDigit(ch)){
                iNum++;
            }

            else {
                iSpec++;
            }
        }


        System.out.println("Letters "+((iChar*100)/totalLength)+" % ");
        System.out.println("Digit "+((iNum*100)/totalLength)+" % ");
        System.out.println("Special "+((iSpec*100)/totalLength)+" % ");
    }
}
