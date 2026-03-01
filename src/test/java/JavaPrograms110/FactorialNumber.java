package JavaPrograms110;

public class FactorialNumber {


    public static void factorialNum(int n){

        int factorialNum=1;
        for (int i=1;i<=n;i++){
            factorialNum=factorialNum*i;

        }
        System.out.println(factorialNum);
    }

    public static long factorialNumRec(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*factorialNumRec(n-1);
    }

    public static void main(String[] args) {
        factorialNum(6);
        System.out.println(factorialNumRec(6));
    }
}
