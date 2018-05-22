package sample;

public class Excavators extends Thread {
    Main main;
    int x = 0;
    int y = -450;

    Excavators(Main main) {
        this.main = main;
    }


    public void run() {
        for (; ; ) {
            try {
                if (y < -100) {
                    y++;
                } else {
                    y = -100;
                }
                setCoordinates1(-400, y);
                setCoordinates2(-200, y);
                setCoordinates3(0, y);
                setCoordinates4(200, y);
                setCoordinates5(400, y);
                Thread.sleep(10);
                System.out.println(x + "a" + y);
            } catch (InterruptedException e) {
            }
        }
    }

    public void setCoordinates1(double x, double y) {
        main.moveExcavator1(x, y);
    }
    public void setCoordinates2(double x, double y) {
        main.moveExcavator2(x, y);
    }
    public void setCoordinates3(double x, double y) {
        main.moveExcavator3(x, y);
    }
    public void setCoordinates4(double x, double y) {
        main.moveExcavator4(x, y);
    }
    public void setCoordinates5(double x, double y) {
        main.moveExcavator5(x, y);
    }
}
