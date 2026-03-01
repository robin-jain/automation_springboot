package javaConcept;

class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread logic");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}

