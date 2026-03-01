package javaConcept;

public interface Payment {
    // abstract method
//    abstract void pay();

    // default method (Java 8+)
    default void receipt() {
        System.out.println("Receipt generated");
    }

    // static method (Java 8+)
    static void info() {
        System.out.println("Payment interface");
    }
}
