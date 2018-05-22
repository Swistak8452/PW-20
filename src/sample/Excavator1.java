package sample;

public class Excavator1 extends Thread{
    Main main;
    int x = -400;
    int y = -450;

    Excavator1(Main main){
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
        main.moveExcavator1(x, y);
    }
}
