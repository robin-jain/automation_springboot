package JavaPrograms110;

public class LengthOfStringWithoutUsingLen {

    public static void main(String[] args) {
        String str = "String";
        int icount = 0;
        for (char c : str.toCharArray()) {
            icount++;
        }
        System.out.println("size of Array is " + icount);
        int icount1 = 0;
        try{
            while (true) {
                str.charAt(icount1);
                icount1++;

            }
        }
        catch (Exception e){
            System.out.println("size of Array is " + icount1);
        }


        System.out.println("From Recursive way " + recursiveMethod("String"));
    }

public static int  recursiveMethod( String str) {

    try {
        str.charAt(0);
        return 1 + recursiveMethod(str.substring(1));
    } catch (Exception e) {
        System.out.println("Error ");
    }

    return 0;
}
}

