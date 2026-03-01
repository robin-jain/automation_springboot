package JavaPrograms110;

public class StringRotation {

    public static void verifyStringRotation(String s1 ,String s2) {

        if(s1.length()!=s2.length()){
            System.out.println(" s2 is not rotated version of s1");
            return;
        }

        String s3=s1+s1;

        if(s3.contains(s2)){
            System.out.println(" s2 is a rotated version of s1");
        }else {
            System.out.println(" s2 is not rotated version of s1");
        }


    }

    public static void main(String[] args) {
        verifyStringRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee");
    }

}
