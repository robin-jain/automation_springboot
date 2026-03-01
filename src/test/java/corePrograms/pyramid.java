package corePrograms;

public class pyramid {


    public static void main(String[] args) {
        pyramid p = new pyramid();
//         p.print_pyramid();
        p.print_rightAngle();
    }




    public static void print_pyramid() {

        int row =5;
        for (int i = 1; i <= row; i++) {


            for (int s = i ; s <= row; s++) {
                System.out.print(" ");
            }
            for (int star = 1 ; star <= (i*2-1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void print_rightAngle() {

        int row =5;
        for (int i = 1; i <= row; i++) {


//            for (int s = i ; s <= i; s++) {
//                System.out.print(" ");
//            }
            for (int star = 1 ; star <= (2*i-1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
