package sample;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SmallVehicles extends Thread {
    Main main;
    double x = 100;
    double y = 120;
    ImageView imageOfSmallVehicle1 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle2 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle3 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle4 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle5 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle6 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle7 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle8 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle9 = new ImageView(new Image("resources/small.png"));
    ImageView imageOfSmallVehicle10 = new ImageView(new Image("resources/small.png"));

    SmallVehicles(Main main) {
        this.main = main;
        main.createVehicles(imageOfSmallVehicle1);
        main.createVehicles(imageOfSmallVehicle2);
        main.createVehicles(imageOfSmallVehicle3);
        main.createVehicles(imageOfSmallVehicle4);
        main.createVehicles(imageOfSmallVehicle5);
        main.createVehicles(imageOfSmallVehicle6);
        main.createVehicles(imageOfSmallVehicle7);
        main.createVehicles(imageOfSmallVehicle8);
        main.createVehicles(imageOfSmallVehicle9);
        main.createVehicles(imageOfSmallVehicle10);
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

    public void reservation() {

    }

    public void startLoading() {

    }

    public void drive(double x, double y) {
        Platform.runLater(() -> imageOfSmallVehicle1.setTranslateX(x));
        Platform.runLater(() -> imageOfSmallVehicle1.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle2.setTranslateX(x + 200));
        Platform.runLater(() -> imageOfSmallVehicle2.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle3.setTranslateX(x + 400));
        Platform.runLater(() -> imageOfSmallVehicle3.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle4.setTranslateX(x + 600));
        Platform.runLater(() -> imageOfSmallVehicle4.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle5.setTranslateX(x + 800));
        Platform.runLater(() -> imageOfSmallVehicle5.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle6.setTranslateX(x + 1000));
        Platform.runLater(() -> imageOfSmallVehicle6.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle7.setTranslateX(x + 1200));
        Platform.runLater(() -> imageOfSmallVehicle7.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle8.setTranslateX(x + 1400));
        Platform.runLater(() -> imageOfSmallVehicle8.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle9.setTranslateX(x + 1600));
        Platform.runLater(() -> imageOfSmallVehicle9.setTranslateY(y));
        Platform.runLater(() -> imageOfSmallVehicle10.setTranslateX(x + 1800));
        Platform.runLater(() -> imageOfSmallVehicle10.setTranslateY(y));
    }

    public void checkReservation() {

    }

    public void stopLoading() {

    }

    public void smallVehicle() {

    }

    public void largeVehicle() {

    }


}
