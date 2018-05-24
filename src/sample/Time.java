package sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Time extends Thread {

    public int hour = 0;
    public int minute = 0;
    public int second = 0;
    Main main;
    Excavators excavators = new Excavators(main);


    Time(Main main) {
        this.main = main;
    }

    public void run() {
        for (; ; ) {
            try {
                second = second + 2;
                if (second == 60) {
                    second = 0;
                    minute++;
                }
                if (minute == 60) {
                    minute = 0;
                    hour++;
                }
                if (hour == 24) {
                    hour = 0;
                }
                if (hour == 0 && minute == 5 && second == 0) {
                }
                setTime(hour, minute, second);
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }


    public void setTime(int h, int m, int s) {
        Excavators excavators = new Excavators(main);
        excavators.start(h, m, s);
        System.out.println(h + ":" + m + ":" + s);
        main.updateTime(h, m, s);

    }
}