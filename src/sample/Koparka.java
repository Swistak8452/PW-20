package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Koparka extends Thread{
    Main main;
    int x = -400;
    int y = -450;

    Koparka(Main main){
        this.main = main;
    }


    public void run() {
        for (; ; ) {
            try {
                if(y<-100){
                    y++;
                }else{
                    y = -100;
                }
                setCoordinates(x, y);
                Thread.sleep(10);
                System.out.println(x + "a" + y);
            } catch (InterruptedException e) {
            }
        }
    }

    public void setCoordinates(double x, double y){
        main.moveKoparka(x, y);
    }
}
