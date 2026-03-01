package JavaPrograms110;

public class SwappingWithoutUsingThird {


    public static void main(String[] args) {
        String s1="This is java";
        String s2="New Year";

        s1=s1+s2;

        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);


    }
}
