package JavaPrograms110;

public class ArmstrongNumber {


    public static boolean isArmstrongNumber(int num1) {

        int num=num1;
        int digit = 0;
        int newNum=0;
        int len= String.valueOf(Integer.valueOf(num)).length();

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            newNum+= (int) Math.pow(digit,len);
        }

        return newNum==num1;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
}
