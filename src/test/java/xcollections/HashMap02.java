package xcollections;

import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {
        HashMap02 hashMap02=new HashMap02();
        hashMap02.putHashmap();
    }
    public void putHashmap(){

        HashMap<Integer,String> studentMap= new HashMap<>();
        studentMap.put(1,"Mani");
        studentMap.put(2,"Mani01");
        studentMap.put(3,"Mani02");
        studentMap.put(4,"Mani03");
       studentMap.forEach((key,value)-> System.out.println(key+" "+value));
        HashMap<Integer,String> studentMapAnother= new HashMap<>();
        studentMapAnother.put(6,"2222");
        studentMapAnother.putAll(studentMap);
        studentMapAnother.putIfAbsent(4,"Done");

        studentMapAnother.forEach((key,value)-> System.out.println(key+" : "+value));


    }
}
