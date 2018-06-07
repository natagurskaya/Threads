package ua.com.gurskaya.timer;

class Timer implements Runnable {

    private TimerCountdown timerCountdown;

    public Timer(TimerCountdown timerCountdown) {
        this.timerCountdown = timerCountdown;
    }

    public void run() {
        timerCountdown.countdown();
    }
}
