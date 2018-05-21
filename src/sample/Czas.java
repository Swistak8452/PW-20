package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.util.Calendar;

public class Czas extends Thread {

    Thread t;
    public int hour;
    public int minute;
    public int second;
    Calendar calendar;
    Main main;
    Text t1;
    StackPane root;


    Czas() {
    }

    public void run() {
        for (; ; ) {
            try {
                getTime();
                drawText();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void start() {
        t = new Thread(this);
        t.start();

    }

    public void getTime() {
        calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public void drawText() {
        root = new StackPane();
        t1 = new Text(200, 50, hour + ":" + minute + ":" + second);
        root.getChildren().add(t1);
    }
}
