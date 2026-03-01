package javaConcept;

public class Encaps {

    private String name;
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public static void main(String[] args) {
        Encaps e= new Encaps();
        e.setAdd("Done");
        System.out.println(e.getAdd());
    }
}
