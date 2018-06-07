package ua.com.gurskaya.timer;

class TimerCountdown {

    private String name;
    private int seconds;

    public TimerCountdown(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    void countdown() {
        while (seconds > 0) {
            try {
                Thread.sleep(1000);
                System.out.println(name + ": " + seconds + " seconds left");
                seconds--;
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread is interrupted", e);
            }
        }
    }
}
