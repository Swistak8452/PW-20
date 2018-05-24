package sample;


public class Excavators extends Thread {
    Main main;
    int x = 0;
    int y = 0;

    Excavators(Main main) {
        this.main = main;
    }


//    public void run() {
//        for (; ; ) {
//            try {
//                System.out.println(x + "a" + y);
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//            }
//        }
//    }

    public void start(int h, int m, int s){
        getTime(h, m, s);
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

    public void setCoordinates() {
        setCoordinates1(-400, y);
        setCoordinates2(-200, y);
        setCoordinates3(0, y);
        setCoordinates4(200, y);
        setCoordinates5(400, y);
    }

    public void moveDown() {
        y = 0;
        setCoordinates();
        main.stopBreak();
    }

    public void moveUp() {
        y = -200;
        setCoordinates();
        main.startBreak();
    }

    public void stay() {
        y = 0;
        setCoordinates();
        main.stopBreak();
    }

    public void getTime(int h, int m, int s) {
        if (h == 0 && m >= 0 && m < 5) {
            moveDown();
        } else if (h == 0 && m >= 5 && m < 15) {
            moveUp();
        } else if (h == 0 && m >= 15 && m < 30) {
            moveDown();
        } else if(h == 0 && m >= 30 && m < 45){
            moveUp();
        }else if(h == 0 && m >= 45 && m < 60){
            moveDown();
        }else if(h == 1 && m >= 0 && m < 15){
            moveUp();
        }else{
            stay();
        }
    }
}