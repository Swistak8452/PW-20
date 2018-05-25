package sample;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LargeVehicles extends Thread{
    Main main;
    double x = 100;
    double y = 120;
    ImageView imageOfLargeVehicle1 = new ImageView(new Image("resources/large.png"));
    ImageView imageOfLargeVehicle2 = new ImageView(new Image("resources/large.png"));
    ImageView imageOfLargeVehicle3 = new ImageView(new Image("resources/large.png"));
    ImageView imageOfLargeVehicle4 = new ImageView(new Image("resources/large.png"));
    ImageView imageOfLargeVehicle5 = new ImageView(new Image("resources/large.png"));

    LargeVehicles(Main main){
        this.main = main;
        main.createVehicles(imageOfLargeVehicle1);
        main.createVehicles(imageOfLargeVehicle2);
        main.createVehicles(imageOfLargeVehicle3);
        main.createVehicles(imageOfLargeVehicle4);
        main.createVehicles(imageOfLargeVehicle5);
    }

    public synchronized void run() {
        for (; ; ) {
            try {
                x = x - 5;
                drive(x, y);
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
        }
    }


    public void drive(double x, double y) {
//        Platform.runLater(() -> imageOfLargeVehicle1.setTranslateX(x + 2000));
//        Platform.runLater(() -> imageOfLargeVehicle1.setTranslateY(y));
//        Platform.runLater(() -> imageOfLargeVehicle2.setTranslateX(x + 2200));
//        Platform.runLater(() -> imageOfLargeVehicle2.setTranslateY(y));
//        Platform.runLater(() -> imageOfLargeVehicle3.setTranslateX(x + 2400));
//        Platform.runLater(() -> imageOfLargeVehicle3.setTranslateY(y));
//        Platform.runLater(() -> imageOfLargeVehicle4.setTranslateX(x + 2600));
//        Platform.runLater(() -> imageOfLargeVehicle4.setTranslateY(y));
//        Platform.runLater(() -> imageOfLargeVehicle5.setTranslateX(x + 2800));
//        Platform.runLater(() -> imageOfLargeVehicle5.setTranslateY(y));
    }

    public void checkTime(int h, int m, int s){
        if (h == 0 && m >= 0 && m < 60) {
        } else if (h == 1 && m >= 0 && m < 60) {
        } else if (h == 2 && m >= 0 && m < 60) {
        }  else {
        }

    }

}
