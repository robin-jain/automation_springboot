package XBasic;

import java.util.Arrays;

public class greek {

    public static void sum( int [] num) {
        int total=0;
        for (int i=0;i<num.length;i++){
            total+=num[i];
        }
        System.out.println("Total sum is "+ total);
    }

    public static void main(String[] args) {
int [] num= {1,2,3,43,5};
sum(num);
        Student [] stdArray;

        stdArray = new Student[5];
        stdArray[0]=new Student("Mani",0);
        stdArray[1]=new Student("Mani1",1);
        stdArray[2]=new Student("Mani2",2);
        stdArray[3]=new Student("Mani3",3);
        stdArray[4]=new Student("Mani4",4);

        System.out.println(Arrays.toString(stdArray));

        for (int i=0;i<stdArray.length;i++){
            System.out.println("Student name :"+stdArray[i].name+" :  "+stdArray[i].age);
        }


        Student s1=new Student("Saraswati",1);
        Student s2=new Student(s1);

        System.out.println("Name + " +s2.name+"Age is :"+s2.age);
    }



}
