package javaConcept;

public class ImmutableStrg {


    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        String c = new String("Java");

        System.out.println("a reference id: " + System.identityHashCode(a));
        System.out.println("b reference id: " + System.identityHashCode(b));
         b = "Java"+"test";
        String d = "Java";
        System.out.println("d reference id: " + System.identityHashCode(d));
        System.out.println("b reference id: " + System.identityHashCode(b));
        System.out.println("c reference id: " + System.identityHashCode(c));
    }
}
