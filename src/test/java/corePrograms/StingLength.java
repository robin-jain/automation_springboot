package corePrograms;


public class StingLength {

    public void strLength() {
        int iCount = 0;
        String str = "Automation";

        for (int i = 0; ; i++) {
            try {
                Character c = str.charAt(i);
                iCount++;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("done");
                break;
            }

        }
        System.out.println(" Size of string is :" + iCount);
    }

    static int iCount = 0;

    public void stringLbyRecursive(String str) {

        str = "Automation";
        try {
            str.charAt(iCount);
            iCount++;
            stringLbyRecursive(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(iCount);
        }

    }


    public void usingWhileFunction() {

        int iCount = 0;
        String str = "Automation";

        while (true) {

            try {
                str.charAt(iCount);
                iCount++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }


        }
        System.out.println("size is " + iCount);

    }

    public static void main(String[] args) {
        StingLength s = new StingLength();
        s.strLength();
        s.stringLbyRecursive("Automation");
        s.usingWhileFunction();
    }
}
