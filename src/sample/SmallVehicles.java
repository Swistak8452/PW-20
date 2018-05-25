package sample;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Calendar;
import java.util.Date;

public class SmallVehicles extends Thread {
    Main main;
    int placeNumber;
    double xSmallVehicle1 = 800;
    double ySmallVehicle1 = 140, ySmallVehicle2 = 140, ySmallVehicle3 = 140, ySmallVehicle4 = 140, ySmallVehicle5 = 140, ySmallVehicle6 = 140, ySmallVehicle7 = 140, ySmallVehicle8 = 140, ySmallVehicle9 = 140, ySmallVehicle10 = 140;
    double xSmallVehicle2 = 1000, xSmallVehicle3 = 1200, xSmallVehicle4 = 1400, xSmallVehicle5 = 1600, xSmallVehicle6 = 1800, xSmallVehicle7 = 2000, xSmallVehicle8 = 2200, xSmallVehicle9 = 2400, xSmallVehicle10 = 2600;
    Calendar calendar = Calendar.getInstance();
    Date date1, date2, date3, date4, date5, date6, date7, date8, date9, date10;
    long time1, time2, time3, time4, time5, time6, time7, time8, time9, time10 = 0;
    int second1, second2, second3, second4, second5, second6, second7, second8, second9, second10 = 0;
    int tableOfPlaces[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
                drive(xSmallVehicle1, ySmallVehicle1, xSmallVehicle2, ySmallVehicle2, xSmallVehicle3, ySmallVehicle3, xSmallVehicle4, ySmallVehicle4, xSmallVehicle5, ySmallVehicle5, xSmallVehicle6, ySmallVehicle6, xSmallVehicle7, ySmallVehicle7, xSmallVehicle8, ySmallVehicle8, xSmallVehicle9, ySmallVehicle9, xSmallVehicle10, ySmallVehicle10);
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }

    }

    public void setX() {
        xSmallVehicle1 = moveSmallVehicles(xSmallVehicle1, 1);
        xSmallVehicle2 = moveSmallVehicles(xSmallVehicle2, 2);
        xSmallVehicle3 = moveSmallVehicles(xSmallVehicle3, 3);
        xSmallVehicle4 = moveSmallVehicles(xSmallVehicle4, 4);
        xSmallVehicle5 = moveSmallVehicles(xSmallVehicle5, 5);
        xSmallVehicle6 = moveSmallVehicles(xSmallVehicle6, 6);
        xSmallVehicle7 = moveSmallVehicles(xSmallVehicle7, 7);
        xSmallVehicle8 = moveSmallVehicles(xSmallVehicle8, 8);
        xSmallVehicle9 = moveSmallVehicles(xSmallVehicle9, 9);
        xSmallVehicle10 = moveSmallVehicles(xSmallVehicle10, 10);
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

    public double moveSmallVehicles(double vehicleX, int vehicleNumber) {
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

    public int checkReservation(int placeNumber) {
        return tableOfPlaces[placeNumber];
    }

    public int lockPlace(int placeNumber, int vehicleNumber) {
        if (tableOfPlaces[placeNumber] == 0) {
            tableOfPlaces[placeNumber] = vehicleNumber;
        }
        return tableOfPlaces[placeNumber] = vehicleNumber;
    }

    public void unlockPlace(int placeNumber, int vehicleNumber) {
        if (tableOfPlaces[placeNumber] == vehicleNumber) {
            tableOfPlaces[placeNumber] = 0;
        }
    }

    public double make(int placeNumber, double vehicleX, int vehicleNumber) {
        if (checkReservation(placeNumber) == 0) {
            lockPlace(placeNumber, vehicleNumber);
            setVehicleY(vehicleNumber, 40);
            setTime(vehicleNumber);
            return vehicleX;
        } else if (checkReservation(placeNumber) == vehicleNumber) {
            setVehicleY(vehicleNumber, 40);
            if(checkTime() - time1 > 15000){
                setVehicleY(vehicleNumber, 140);
                unlockPlace(placeNumber, vehicleNumber);
                return vehicleX - 5;
            }else {
                return vehicleX;
            }
        } else {
            return vehicleX - 5;
        }
    }

    public long setTime(int vehicleNumber) {
        if (vehicleNumber == 1) {
            date1 = new Date();
            return time1 = date1.getTime();
        } else if (vehicleNumber == 2) {
            date2 = new Date();
            return time2 = date2.getTime();
        } else if (vehicleNumber == 3) {
            date3 = new Date();
            return time3 = date3.getTime();
        } else if (vehicleNumber == 4) {
            date4 = new Date();
            return time4 = date4.getTime();
        } else if (vehicleNumber == 5) {
            date5 = new Date();
            return time5 = date5.getTime();
        } else if (vehicleNumber == 6) {
            date6 = new Date();
            return time6 = date6.getTime();
        } else if (vehicleNumber == 7) {
            date7 = new Date();
            return time7 = date7.getTime();
        } else if (vehicleNumber == 8) {
            date8 = new Date();
            return time8 = date8.getTime();
        } else if (vehicleNumber == 9) {
            date9 = new Date();
            return time9 = date9.getTime();
        } else if (vehicleNumber == 10) {
            date10 = new Date();
            return time10 = date10.getTime();
        } else {
            return date1.getTime();
        }
    }

    public long checkTime(){
        Date d1 = new Date();
        return d1.getTime();
    }

    public void drive(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5, double x6, double y6, double x7, double y7, double x8, double y8, double x9, double y9, double x10, double y10) {
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
