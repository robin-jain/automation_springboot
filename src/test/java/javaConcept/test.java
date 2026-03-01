package javaConcept;

public enum test {

    LOW("low"),
    MEDIUM("Medium"),
    HIGH("high");

    private final String value;

    test(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class myclass {

    public static void main() {
        System.out.println("done");
    }
    public static void main(String[] args) {
        System.out.println(test.HIGH.getValue());
        System.out.println(test.LOW.getValue());
        System.out.println(test.MEDIUM.getValue());
    }
}