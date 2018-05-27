package sample;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Vehicles extends Thread {
    Main main;
    Work work = new Work();
    Reservations reservations = new Reservations();
    int placeNumber;
    double ySmallVehicle1 = 140, ySmallVehicle2 = 140, ySmallVehicle3 = 140, ySmallVehicle4 = 140, ySmallVehicle5 = 140, ySmallVehicle6 = 140, ySmallVehicle7 = 140, ySmallVehicle8 = 140, ySmallVehicle9 = 140, ySmallVehicle10 = 140;
    double xSmallVehicle1 = 800, xSmallVehicle2 = 1000, xSmallVehicle3 = 1200, xSmallVehicle4 = 1400, xSmallVehicle5 = 1600, xSmallVehicle6 = 1800, xSmallVehicle7 = 2000, xSmallVehicle8 = 2200, xSmallVehicle9 = 2400, xSmallVehicle10 = 2600;
    double yLargeVehicle1 = 200, yLargeVehicle2 = 200, yLargeVehicle3 = 200, yLargeVehicle4 = 200, yLargeVehicle5 = 200;
    double xLargeVehicle1 = 2800, xLargeVehicle2 = 3000, xLargeVehicle3 = 3200, xLargeVehicle4 = 3400, xLargeVehicle5 = 3600;
    public int hour = 0;
    public int minute = 0;
    public int second = 0;
    Image small = new Image("resources/small.png");
    Image large = new Image("resources/large.png");
    ImageView imageOfSmallVehicle1 = new ImageView(small), imageOfSmallVehicle2 = new ImageView(small), imageOfSmallVehicle3 = new ImageView(small), imageOfSmallVehicle4 = new ImageView(small), imageOfSmallVehicle5 = new ImageView(small), imageOfSmallVehicle6 = new ImageView(small), imageOfSmallVehicle7 = new ImageView(small), imageOfSmallVehicle8 = new ImageView(small), imageOfSmallVehicle9 = new ImageView(small), imageOfSmallVehicle10 = new ImageView(small);
    ImageView imageOfLargeVehicle1 = new ImageView(large), imageOfLargeVehicle2 = new ImageView(large), imageOfLargeVehicle3 = new ImageView(large), imageOfLargeVehicle4 = new ImageView(large), imageOfLargeVehicle5 = new ImageView(large);

    Vehicles(Main main) {
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
        main.createVehicles(imageOfLargeVehicle1);
        main.createVehicles(imageOfLargeVehicle2);
        main.createVehicles(imageOfLargeVehicle3);
        main.createVehicles(imageOfLargeVehicle4);
        main.createVehicles(imageOfLargeVehicle5);
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
                setX();
                if (minute == 0 && second == 0) {
                    reservations.unlockAll();
                } else if (minute >= 10 && minute < 20) {
                    reservations.lockAll();
                } else if (hour == 0 && minute == 20 && second == 0) {
                    reservations.unlockAll();
                } else if (minute >= 30 && minute < 40) {
                    reservations.lockAll();
                } else if (hour == 0 && minute == 40 && second == 0) {
                    reservations.unlockAll();
                } else if (minute >= 50 && minute < 60) {
                    reservations.lockAll();
                }  else {
                }
                refreshImageOfVehicle(xSmallVehicle1, ySmallVehicle1, xSmallVehicle2, ySmallVehicle2, xSmallVehicle3, ySmallVehicle3, xSmallVehicle4, ySmallVehicle4, xSmallVehicle5, ySmallVehicle5, xSmallVehicle6, ySmallVehicle6, xSmallVehicle7, ySmallVehicle7, xSmallVehicle8, ySmallVehicle8, xSmallVehicle9, ySmallVehicle9, xSmallVehicle10, ySmallVehicle10, xLargeVehicle1, yLargeVehicle1, xLargeVehicle2, yLargeVehicle2, xLargeVehicle3, yLargeVehicle3, xLargeVehicle4, yLargeVehicle4, xLargeVehicle5, yLargeVehicle5);
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
        xLargeVehicle1 = choosePlaceOfWork(xLargeVehicle1, 11);
        xLargeVehicle2 = choosePlaceOfWork(xLargeVehicle2, 12);
        xLargeVehicle3 = choosePlaceOfWork(xLargeVehicle3, 13);
        xLargeVehicle4 = choosePlaceOfWork(xLargeVehicle4, 14);
        xLargeVehicle5 = choosePlaceOfWork(xLargeVehicle5, 15);
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
        } else if (vehicleNumber == 11) {
            yLargeVehicle1 = setY;
        } else if (vehicleNumber == 12) {
            yLargeVehicle2 = setY;
        } else if (vehicleNumber == 13) {
            yLargeVehicle3 = setY;
        } else if (vehicleNumber == 14) {
            yLargeVehicle4 = setY;
        } else if (vehicleNumber == 15) {
            yLargeVehicle5 = setY;
        }
    }

    public double choosePlaceOfWork(double vehicleX, int vehicleNumber) {
        if (vehicleX == -400) {
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
        }
        return load(placeNumber, vehicleX, vehicleNumber);
    }

    public double load(int placeNumber, double vehicleX, int vehicleNumber) {
        if (vehicleX < - 800) {
            return work.restartVehicle(vehicleNumber);
        }
        if (vehicleNumber > 10) {
            if (placeNumber % 2 == 1 && reservations.checkReservation(placeNumber) == 0 && reservations.checkReservation(placeNumber + 1) == 0) {
                reservations.lockPlace(placeNumber, vehicleNumber);
                reservations.lockPlace(placeNumber + 1, vehicleNumber);
                setVehicleY(vehicleNumber, 40);
                work.setTime(vehicleNumber);
                return vehicleX;
            } else if (reservations.checkReservation(placeNumber) == vehicleNumber) {
                if (work.checkTime(vehicleNumber) - work.chooseTime(vehicleNumber) > 2000) {
                    reservations.unlockPlace(placeNumber);
                    reservations.unlockPlace(placeNumber + 1);
                    setVehicleY(vehicleNumber, 140);
                    return work.restartVehicle(vehicleNumber);
                } else {
                    setVehicleY(vehicleNumber, 40);
                    if(placeNumber != 0) {
                        return (-500 + placeNumber * 100);
                    } else {
                        return vehicleX;
                    }
                }
            } else {
                setVehicleY(vehicleNumber, 140);
                return vehicleX - 5;
            }
        } else {
            if (reservations.checkReservation(placeNumber) == 0) {
                reservations.lockPlace(placeNumber, vehicleNumber);
                setVehicleY(vehicleNumber, 40);
                work.setTime(vehicleNumber);
                return vehicleX;
            } else if (reservations.checkReservation(placeNumber) == vehicleNumber) {
                if (work.checkTime(vehicleNumber) - work.chooseTime(vehicleNumber) > 2000) {
                    reservations.unlockPlace(placeNumber);
                    setVehicleY(vehicleNumber, 140);
                    return work.restartVehicle(vehicleNumber);
                } else {
                    setVehicleY(vehicleNumber, 40);
                    if(placeNumber != 0) {
                        return (-500 + placeNumber * 100);
                    } else {
                        return vehicleX;
                    }
                }
            } else {
                setVehicleY(vehicleNumber, 140);
                return vehicleX - 5;
            }
        }
    }



    public void refreshImageOfVehicle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5, double x6, double y6, double x7, double y7, double x8, double y8, double x9, double y9, double x10, double y10, double x11, double y11, double x12, double y12, double x13, double y13, double x14, double y14, double x15, double y15) {
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
        Platform.runLater(() -> imageOfLargeVehicle1.setTranslateX(x11));
        Platform.runLater(() -> imageOfLargeVehicle1.setTranslateY(y11));
        Platform.runLater(() -> imageOfLargeVehicle2.setTranslateX(x12));
        Platform.runLater(() -> imageOfLargeVehicle2.setTranslateY(y12));
        Platform.runLater(() -> imageOfLargeVehicle3.setTranslateX(x13));
        Platform.runLater(() -> imageOfLargeVehicle3.setTranslateY(y13));
        Platform.runLater(() -> imageOfLargeVehicle4.setTranslateX(x14));
        Platform.runLater(() -> imageOfLargeVehicle4.setTranslateY(y14));
        Platform.runLater(() -> imageOfLargeVehicle5.setTranslateX(x15));
        Platform.runLater(() -> imageOfLargeVehicle5.setTranslateY(y15));
    }
}
