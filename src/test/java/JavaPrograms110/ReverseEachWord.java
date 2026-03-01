package JavaPrograms110;

public class ReverseEachWord {

    public static void reverseWord(String str){
        String reversString="";

        String [] words=str.split(" ");

        for (String word:words ){
            String reverseWords="";
            char ch [] =word.toCharArray();
            for (int i=ch.length-1;i>=0;i--){
                reverseWords+=ch[i];


            }
            reversString=reversString+ reverseWords+" ";

        }
        System.out.println(reversString);
    }

    public static void main(String[] args) {
        reverseWord("Java Concept Of The Day");
    }
}
