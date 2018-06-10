package ua.com.gurskaya.timer;

public class Starter {
    public static void main(String[] args) {
        Timer timer = new Timer("Timer 1", 5);
        Timer timer2 = new Timer("Timer 2", 5);
        Timer timer3 = new Timer("Timer 3", 5);

        Thread thread = new Thread(timer);
        Thread thread2 = new Thread(timer2);
        Thread thread3 = new Thread(timer3);

        thread.start();
        thread2.start();
        thread3.start();
    }
}
