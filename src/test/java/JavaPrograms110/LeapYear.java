package JavaPrograms110;

public class LeapYear {

    public static void main(String[] args) {

        int leapYear=2024;

        if(leapYear%400==0 || (leapYear%4==0 && leapYear%100!=0)){
            System.out.println( leapYear + " is a leap year");
        }else {
            System.out.println( leapYear + " is NOT a leap year");
        }

    }
}
