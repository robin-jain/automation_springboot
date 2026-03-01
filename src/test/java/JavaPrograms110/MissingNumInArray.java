package JavaPrograms110;

public class MissingNumInArray {

    public static int sumOfNumber(int n){
        return (n*(n+1))/2;
    }

    public static int sumOfElement( int [] arrayA){
        int sum=0;
        for ( int i:arrayA){
            sum+=i;
        }
    return sum;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int missingNum=sumOfNumber(n)-sumOfElement(a);
        System.out.println(missingNum);

    }
}
