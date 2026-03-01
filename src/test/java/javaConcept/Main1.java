package javaConcept;

public class Main1 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main1 thread = new Main1();
        thread.start();
        // Wait for the thread to finish
//        while(thread.isAlive()) {
//            System.out.println("Waiting...");
//        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Amount value outside thread "+amount);
        System.out.println("Main: " + amount);
    }
    public void run() {
        System.out.println("Amount value before thread " +amount);
        amount++;
        System.out.println("Amount value in thread " +amount);
    }
}