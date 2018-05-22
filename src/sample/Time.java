package sample;


import java.util.Calendar;

public class Time extends Thread {

    public int hour = 0;
    public int minute = 0;
    public int second = 0;
    Calendar calendar;
    Main main;
    Excavators excavators = new Excavators(main);

    Time(Main main) {
        this.main = main;
    }

    public void run() {
        for (; ; ) {
            try {
                second++;
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
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }


    public void setTime(int h, int m, int s) {
//        calendar = Calendar.getInstance();
//        hour = calendar.get(Calendar.HOUR);
//        minute = calendar.get(Calendar.MINUTE);
//        second = calendar.get(Calendar.SECOND);
        System.out.println(h + ":" + m + ":" + s);
        main.updateTime(h, m, s);
        if (h == 0 && m >= 5 && m < 35) {
            System.out.println("11111111111111111111");
            //excavators.moveUp();
        } else if ((h == 0 && m >= 35) || (h == 1 && m < 5)) {
            System.out.println("2222222222222222222222");
            //excavators.moveDown();
        } else {
            System.out.println("33333333333333333333333");
            //excavators.stay();
        }
    }
}