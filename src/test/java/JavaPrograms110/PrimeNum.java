package JavaPrograms110;

public class PrimeNum {


    public static void main(String[] args) {
        boolean primeNum=true;
        int num=10;
        if(num==1){
            System.out.println(num + " Prime number");
        }

        for (int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                primeNum=false;

            }

        }
    if(primeNum){
        System.out.println(num+" is a prime num");
     }else {
        System.out.println(num+ " is Not a prime num");
    }
    }
}
