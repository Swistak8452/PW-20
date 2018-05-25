package sample;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SmallVehicles extends Thread {
    Main main;
    Work work =  new Work();
    Reservations reservations = new Reservations();
    int placeNumber;
    double xSmallVehicle1 = 800;
    double ySmallVehicle1 = 140, ySmallVehicle2 = 140, ySmallVehicle3 = 140, ySmallVehicle4 = 140, ySmallVehicle5 = 140, ySmallVehicle6 = 140, ySmallVehicle7 = 140, ySmallVehicle8 = 140, ySmallVehicle9 = 140, ySmallVehicle10 = 140;
    double xSmallVehicle2 = 1000, xSmallVehicle3 = 1200, xSmallVehicle4 = 1400, xSmallVehicle5 = 1600, xSmallVehicle6 = 1800, xSmallVehicle7 = 2000, xSmallVehicle8 = 2200, xSmallVehicle9 = 2400, xSmallVehicle10 = 2600;
    public int hour = 0;
    public int minute = 0;
    public int second = 0;
    Image small = new Image("resources/small.png");
    ImageView imageOfSmallVehicle1 = new ImageView(small), imageOfSmallVehicle2 = new ImageView(small), imageOfSmallVehicle3 = new ImageView(small), imageOfSmallVehicle4 = new ImageView(small), imageOfSmallVehicle5 = new ImageView(small), imageOfSmallVehicle6 = new ImageView(small), imageOfSmallVehicle7 = new ImageView(small), imageOfSmallVehicle8 = new ImageView(small), imageOfSmallVehicle9 = new ImageView(small), imageOfSmallVehicle10 = new ImageView(small);

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
                if (hour == 0 && minute >= 0 && minute < 10) {
                    setX();
                } else if (hour == 0 && minute >= 10 && minute < 20) {

                } else if (hour == 0 && minute >= 20 && minute < 30) {
                    setX();
                } else if (hour == 0 && minute >= 30 && minute < 40) {

                } else if (hour == 0 && minute >= 40 && minute < 50) {
                    setX();
                } else if (hour == 0 && minute >= 50 && minute < 60) {

                } else if (hour == 1 && minute >= 0 && minute < 60) {
                    setX();
                } else {

                }
                refreshImageOfVehicle(xSmallVehicle1, ySmallVehicle1, xSmallVehicle2, ySmallVehicle2, xSmallVehicle3, ySmallVehicle3, xSmallVehicle4, ySmallVehicle4, xSmallVehicle5, ySmallVehicle5, xSmallVehicle6, ySmallVehicle6, xSmallVehicle7, ySmallVehicle7, xSmallVehicle8, ySmallVehicle8, xSmallVehicle9, ySmallVehicle9, xSmallVehicle10, ySmallVehicle10);
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }

    }

    public void setX() {
        xSmallVehicle1 = choosePlaceOfWork(xSmallVehicle1, 1);
        xSmallVehicle2 = choosePlaceOfWork(xSmallVehicle2, 2);
        xSmallVehicle3 = choosePlaceOfWork(xSmallVehicle3, 3);
        xSmallVehicle4 = choosePlaceOfWork(xSmallVehicle4, 4);
        xSmallVehicle5 = choosePlaceOfWork(xSmallVehicle5, 5);
        xSmallVehicle6 = choosePlaceOfWork(xSmallVehicle6, 6);
        xSmallVehicle7 = choosePlaceOfWork(xSmallVehicle7, 7);
        xSmallVehicle8 = choosePlaceOfWork(xSmallVehicle8, 8);
        xSmallVehicle9 = choosePlaceOfWork(xSmallVehicle9, 9);
        xSmallVehicle10 = choosePlaceOfWork(xSmallVehicle10, 10);
    }

    public void setVehicleY(int vehicleNumber, double setY) {
        if (vehicleNumber == 1) {
            ySmallVehicle1 = setY;
        } else if (vehicleNumber == 2) {
            ySmallVehicle2 = setY;
        } else if (vehicleNumber == 3) {
            ySmallVehicle3 = setY;
        } else if (vehicleNumber == 4) {
            ySmallVehicle4 = setY;
        } else if (vehicleNumber == 5) {
            ySmallVehicle5 = setY;
        } else if (vehicleNumber == 6) {
            ySmallVehicle6 = setY;
        } else if (vehicleNumber == 7) {
            ySmallVehicle7 = setY;
        } else if (vehicleNumber == 8) {
            ySmallVehicle8 = setY;
        } else if (vehicleNumber == 9) {
            ySmallVehicle9 = setY;
        } else if (vehicleNumber == 10) {
            ySmallVehicle10 = setY;
        }
    }

    public double choosePlaceOfWork(double vehicleX, int vehicleNumber) {
        if (vehicleX < -1500) {
            return 800;
        } else if (vehicleX == -400) {
            placeNumber = 1;
        } else if (vehicleX == -300) {
            placeNumber = 2;
        } else if (vehicleX == -200) {
            placeNumber = 3;
        } else if (vehicleX == -100) {
            placeNumber = 4;
        } else if (vehicleX == 0) {
            placeNumber = 5;
        } else if (vehicleX == 100) {
            placeNumber = 6;
        } else if (vehicleX == 200) {
            placeNumber = 7;
        } else if (vehicleX == 300) {
            placeNumber = 8;
        } else if (vehicleX == 400) {
            placeNumber = 9;
        } else if (vehicleX == 500) {
            placeNumber = 10;
        } else {
            return vehicleX - 5;
        }
        return make(placeNumber, vehicleX, vehicleNumber);
    }



    public double make(int placeNumber, double vehicleX, int vehicleNumber) {
        if (reservations.checkReservation(placeNumber) == 0) {
            reservations.lockPlace(placeNumber, vehicleNumber);
            setVehicleY(vehicleNumber, 40);
            work.setTime(vehicleNumber);
            return vehicleX;
        } else if (reservations.checkReservation(placeNumber) == vehicleNumber) {
            setVehicleY(vehicleNumber, 40);
            if(work.checkTime() - work.chooseTime(vehicleNumber) > 15000){
                setVehicleY(vehicleNumber, 140);
                reservations.unlockPlace(placeNumber, vehicleNumber);
                return restartVehicle(vehicleNumber);
            }else {
                return vehicleX;
            }
        } else {
            return vehicleX - 5;
        }
    }

    public double restartVehicle(int vehicleNumber){
        if (vehicleNumber == 1) {
            return xSmallVehicle1 = 800;
        } else if (vehicleNumber == 2) {
            return xSmallVehicle1 = 1000;
        } else if (vehicleNumber == 3) {
            return xSmallVehicle1 = 1200;
        } else if (vehicleNumber == 4) {
            return xSmallVehicle1 = 1400;
        } else if (vehicleNumber == 5) {
            return xSmallVehicle1 = 1600;
        } else if (vehicleNumber == 6) {
            return xSmallVehicle1 = 1800;
        } else if (vehicleNumber == 7) {
            return xSmallVehicle1 = 2000;
        } else if (vehicleNumber == 8) {
            return xSmallVehicle1 = 2200;
        } else if (vehicleNumber == 9) {
            return xSmallVehicle1 = 2400;
        } else if (vehicleNumber == 10) {
            return xSmallVehicle1 = 2600;
        } else {
            return 3000;
        }
    }



    public void refreshImageOfVehicle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5, double x6, double y6, double x7, double y7, double x8, double y8, double x9, double y9, double x10, double y10) {
        Platform.runLater(() -> imageOfSmallVehicle1.setTranslateX(x1));
        Platform.runLater(() -> imageOfSmallVehicle1.setTranslateY(y1));
        Platform.runLater(() -> imageOfSmallVehicle2.setTranslateX(x2));
        Platform.runLater(() -> imageOfSmallVehicle2.setTranslateY(y2));
        Platform.runLater(() -> imageOfSmallVehicle3.setTranslateX(x3));
        Platform.runLater(() -> imageOfSmallVehicle3.setTranslateY(y3));
        Platform.runLater(() -> imageOfSmallVehicle4.setTranslateX(x4));
        Platform.runLater(() -> imageOfSmallVehicle4.setTranslateY(y4));
        Platform.runLater(() -> imageOfSmallVehicle5.setTranslateX(x5));
        Platform.runLater(() -> imageOfSmallVehicle5.setTranslateY(y5));
        Platform.runLater(() -> imageOfSmallVehicle6.setTranslateX(x6));
        Platform.runLater(() -> imageOfSmallVehicle6.setTranslateY(y6));
        Platform.runLater(() -> imageOfSmallVehicle7.setTranslateX(x7));
        Platform.runLater(() -> imageOfSmallVehicle7.setTranslateY(y7));
        Platform.runLater(() -> imageOfSmallVehicle8.setTranslateX(x8));
        Platform.runLater(() -> imageOfSmallVehicle8.setTranslateY(y8));
        Platform.runLater(() -> imageOfSmallVehicle9.setTranslateX(x9));
        Platform.runLater(() -> imageOfSmallVehicle9.setTranslateY(y9));
        Platform.runLater(() -> imageOfSmallVehicle10.setTranslateX(x10));
        Platform.runLater(() -> imageOfSmallVehicle10.setTranslateY(y10));
    }
}
