package JavaPrograms110;

public class SumOfAllDigit {


    public static void sumOfAll( int num1){

        int num=num1;
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        System.out.println("sum for all digit for num : "+num1 + " sum is : "+sum);

       String.valueOf(num1).chars().map(n->n-'0').forEach(System.out::println);
    }

    public static void main(String[] args) {
        sumOfAll(123);
    }
}

