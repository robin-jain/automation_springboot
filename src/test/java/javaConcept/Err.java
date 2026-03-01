package javaConcept;

public class Err {


    public static void main(String[] args) {


        try{
            int [] a={1,2,3,4,5};
            System.out.println(a[22]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is an error ArrayIndexOutOfBoundsException");
        }
        catch ( ArithmeticException e){
            System.out.println("This is an error ArithmeticException");
        }
        catch (EnumConstantNotPresentException e){
            System.out.println("This is an error EnumConstantNotPresentException");
        }
        catch (Exception e){
            System.out.println("This is an error");
        }finally {
            System.out.println("This is last statement");
        }







    }
}
