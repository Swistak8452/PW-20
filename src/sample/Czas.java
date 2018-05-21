package sample;

import java.util.Calendar;

public class Czas extends Thread{

    Thread t;
    public int hour;
    public int minute;
    public int second;
    Calendar calendar;

    Czas() {
    }

    public void run() {
        for(;;) {
            try {
                calendar = Calendar.getInstance();
                hour = calendar.get(Calendar.HOUR);
                minute = calendar.get(Calendar.MINUTE);
                second = calendar.get(Calendar.SECOND);
                System.out.println(hour + ":" + minute + ":" + second);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void start () {
            t = new Thread (this);
            t.start ();

    }
}
