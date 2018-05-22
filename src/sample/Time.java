package sample;


import java.util.Calendar;

public class Time extends Thread {

    public int hour;
    public int minute;
    public int second;
    Calendar calendar;
    Main main;

    Time(Main main) {
        this.main = main;
    }

    public void run() {
        for (; ; ) {
            try {
                getTime();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }


    public void getTime() {
        calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);
        main.updateTime(hour, minute, second);
    }
}