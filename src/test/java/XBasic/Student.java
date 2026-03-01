package XBasic;

 class Student {

    public String name;
     public int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}
