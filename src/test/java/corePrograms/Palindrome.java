package corePrograms;

public class Palindrome {

    public void palindrome_fu() {
        int original_number = 111;
        int num = original_number;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("after Reverse Number is :" + reverse);
        if (original_number == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No Palindrome");
        }

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.palindrome_fu();
        System.out.println((palindrome.checkIfStringPalindrome()));


    }


    public boolean checkIfStringPalindrome() {
        String str = "MADAM";

        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}
