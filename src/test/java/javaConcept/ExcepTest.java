package javaConcept;

public class ExcepTest {
    public static void main(String args[]) throws Exception {
        int a = 3;
        int b = 0;
        System.out.println("result:" + divide(a,b));
    }

    private static int divide(int a, int b)  {
        if(b == 0) {
            throw new ArithmeticException("second argument cannot be zero.");
        }
        return a / b;
    }
}
