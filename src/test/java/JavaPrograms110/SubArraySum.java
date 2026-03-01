package JavaPrograms110;

public class SubArraySum {

    public static void subArray( int [] mainArray, int num){
        int sum=mainArray[0];
        int start=0;
        for (int i=1;i<mainArray.length;i++){

            sum=sum+mainArray[i];
            while (sum>num && start<=i-1){
                sum=sum-mainArray[start];

            }
            if(sum==num){
//                System.out.println("Continuous sub array of  ");
                for (int j=start;j<=i;j++){
                    System.out.println(mainArray[j] +"   ");
                }
                System.out.println("Done------");
            }
        }

    }

    public static void main(String[] args) {
        subArray(new int[]{8, 10, 12, 8, 6, 32}, 30);
    }
}
