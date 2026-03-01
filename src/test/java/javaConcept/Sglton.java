package javaConcept;

public class Sglton {

    private Sglton() {};

    private static Sglton instance;

    public static Sglton getInstance() {
        if (instance == null) {
            synchronized (Sglton.class) {
                if (instance == null) {
                    instance = new Sglton();
                }
            }
        }
        return instance;
    }
}
