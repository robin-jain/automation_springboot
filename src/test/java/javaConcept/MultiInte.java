package javaConcept;

public interface MultiInte extends Payment,Payment2{


    @Override
    default void receipt() {
        Payment.super.receipt();
    }
}
