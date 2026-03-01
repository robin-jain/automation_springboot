package JavaPrograms110;

public class PasswordChecker {




    public static void main(String[] args) {
        String password="test@123";
        char [] ch=password.toCharArray();

        for (char charEach: ch){

            if(charEach>='a'&&charEach<='z'){
                System.out.println("it has lower char");
            }

            if(Character.isLowerCase(charEach)){
                System.out.println("it has upper char");
            }

        }
    }
}
