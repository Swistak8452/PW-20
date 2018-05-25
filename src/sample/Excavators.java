package sample;


import javafx.application.Platform;

public class Excavators extends Thread {
    Main main;
    int x = 0;
    int y = 0;

    Excavators(Main main) {
        this.main = main;
    }


    public void start(int h, int m, int s) {
        getTime(h, m, s);
    }

    public void setCoordinates() {
        Platform.runLater(() -> main.imageOfExcavator1.setTranslateX(-400));
        Platform.runLater(() -> main.imageOfExcavator1.setTranslateY(y));
        Platform.runLater(() -> main.imageOfExcavator2.setTranslateX(-200));
        Platform.runLater(() -> main.imageOfExcavator2.setTranslateY(y));
        Platform.runLater(() -> main.imageOfExcavator3.setTranslateX(0));
        Platform.runLater(() -> main.imageOfExcavator3.setTranslateY(y));
        Platform.runLater(() -> main.imageOfExcavator4.setTranslateX(200));
        Platform.runLater(() -> main.imageOfExcavator4.setTranslateY(y));
        Platform.runLater(() -> main.imageOfExcavator5.setTranslateX(400));
        Platform.runLater(() -> main.imageOfExcavator5.setTranslateY(y));
    }

    public void moveDown() {
        y = 0;
        setCoordinates();
        stopBreak();
    }

    public void moveUp() {
        y = -200;
        setCoordinates();
        startBreak();
    }

    public void stay() {
        y = 0;
        setCoordinates();
        stopBreak();
    }

    public void startBreak() {
        main.t2.setTranslateX(0);
        Platform.runLater(() -> main.t2.setText("Now we have got break!"));
    }

    public void stopBreak() {
        main.t2.setTranslateX(10000);
    }

    public void getTime(int h, int m, int s) {
        if (h == 0 && m >= 0 && m < 5) {
            moveDown();
        } else if (h == 0 && m >= 5 && m < 15) {
            moveUp();
        } else if (h == 0 && m >= 15 && m < 30) {
            moveDown();
        } else if (h == 0 && m >= 30 && m < 45) {
            moveUp();
        } else if (h == 0 && m >= 45 && m < 60) {
            moveDown();
        } else if (h == 1 && m >= 0 && m < 15) {
            moveUp();
        } else {
            stay();
        }
    }
}