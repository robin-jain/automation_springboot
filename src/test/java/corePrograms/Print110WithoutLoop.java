package corePrograms;

public class Print110WithoutLoop {


    public static void main(String[] args) {
        Print110WithoutLoop p= new Print110WithoutLoop();
        p.print(0);
    }

    public void print110(){
        int i=0;
        while( i < 11){
            System.out.println(i);
            i++;
        }
    }

    static void print(int n) {
        if (n > 10) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

}
