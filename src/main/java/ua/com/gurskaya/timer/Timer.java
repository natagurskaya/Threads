package ua.com.gurskaya.timer;

class Timer implements Runnable {

    private String name;
    private int seconds;

    public Timer(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        System.out.println("You launched timer for " + seconds + " seconds");
        while (seconds > 1) {
            try {
                Thread.sleep(1000);
                System.out.println(name + ": " + (seconds - 1) + " seconds left");
                seconds--;
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread is interrupted", e);
            }
        }
        System.out.println("Your time is up!");
    }
}
