package ua.com.gurskaya.timer;

public class Starter {
    public static void main(String[] args) {
        TimerCountdown timerCountdown = new TimerCountdown("Timer 1", 5);
        TimerCountdown timerCountdown2 = new TimerCountdown("Timer 2", 5);
        TimerCountdown timerCountdown3 = new TimerCountdown("Timer 3", 5);

        Thread thread = new Thread(new Timer(timerCountdown));
        Thread thread2 = new Thread(new Timer(timerCountdown2));
        Thread thread3 = new Thread(new Timer(timerCountdown3));

        thread.start();
        thread2.start();
        thread3.start();
    }
}
