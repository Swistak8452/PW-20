package sample;


import javafx.application.Platform;

public class Excavators extends Thread {
    Main main;
    double xExcavator1 = 0;
    double yExcavator1 = 0;
    double xExcavator2 = 0;
    double yExcavator2 = 0;
    double xExcavator3 = 0;
    double yExcavator3 = 0;
    double xExcavator4 = 0;
    double yExcavator4 = 0;
    double xExcavator5 = 0;
    double yExcavator5 = 0;

    Excavators(Main main) {
        this.main = main;
    }

    public void start(int hour, int minute, int second) {
        getTime(hour, minute, second);
    }

    public void setCoordinates() {
        Platform.runLater(() -> main.imageOfExcavator1.setTranslateX(xExcavator1));
        Platform.runLater(() -> main.imageOfExcavator1.setTranslateY(yExcavator1));
        Platform.runLater(() -> main.imageOfExcavator2.setTranslateX(xExcavator2));
        Platform.runLater(() -> main.imageOfExcavator2.setTranslateY(yExcavator2));
        Platform.runLater(() -> main.imageOfExcavator3.setTranslateX(xExcavator3));
        Platform.runLater(() -> main.imageOfExcavator3.setTranslateY(yExcavator3));
        Platform.runLater(() -> main.imageOfExcavator4.setTranslateX(xExcavator4));
        Platform.runLater(() -> main.imageOfExcavator4.setTranslateY(yExcavator4));
        Platform.runLater(() -> main.imageOfExcavator5.setTranslateX(xExcavator5));
        Platform.runLater(() -> main.imageOfExcavator5.setTranslateY(yExcavator5));
        Platform.runLater(() -> main.t2.setText("Now we have got break!"));
    }

    public void yOfExcavators(double y) {
        yExcavator1 = y;
        yExcavator2 = y;
        yExcavator3 = y;
        yExcavator4 = y;
        yExcavator5 = y;
    }

    public void xOfExcavators() {
        xExcavator1 = -400;
        xExcavator2 = -200;
        xExcavator3 = 0;
        xExcavator4 = 200;
        xExcavator5 = 400;
    }

    public void moveDown() {
        xOfExcavators();
        yOfExcavators(-50);
        setCoordinates();
        Platform.runLater(() -> main.t2.setTranslateX(10000));
    }

    public void moveUp() {
        xOfExcavators();
        yOfExcavators(-250);
        setCoordinates();
        Platform.runLater(() -> main.t2.setTranslateX(0));
    }

    public void stay() {
        xOfExcavators();
        yOfExcavators(-50);
        setCoordinates();
        Platform.runLater(() -> main.t2.setTranslateX(10000));
    }

    public void getTime(int hour, int minute, int second) {
        if (hour == 0 && minute >= 0 && minute < 10) {
            moveDown();
        } else if (hour == 0 && minute >= 10 && minute < 20) {
            moveUp();
        } else if (hour == 0 && minute >= 20 && minute < 30) {
            moveDown();
        } else if (hour == 0 && minute >= 30 && minute < 40) {
            moveUp();
        } else if (hour == 0 && minute >= 40 && minute < 50) {
            moveDown();
        } else if (hour == 0 && minute >= 50 && minute < 60) {
            moveUp();
        } else if (hour == 1 && minute >= 0 && minute < 10) {
            moveDown();
        } else if (hour == 1 && minute >= 10 && minute < 20) {
            moveUp();
        } else if (hour == 1 && minute >= 20 && minute < 30) {
            moveDown();
        } else if (hour == 1 && minute >= 30 && minute < 40) {
            moveUp();
        } else if (hour == 1 && minute >= 40 && minute < 50) {
            moveDown();
        } else if (hour == 1 && minute >= 50 && minute < 60) {
            moveUp();
        } else if (hour == 2 && minute >= 0 && minute < 10) {
            moveDown();
        } else if (hour == 2 && minute >= 10 && minute < 20) {
            moveUp();
        } else if (hour == 2 && minute >= 20 && minute < 30) {
            moveDown();
        } else if (hour == 2 && minute >= 30 && minute < 40) {
            moveUp();
        } else if (hour == 2 && minute >= 40 && minute < 50) {
            moveDown();
        } else if (hour == 2 && minute >= 50 && minute < 60) {
            moveUp();
        } else {
            stay();
        }
    }
}