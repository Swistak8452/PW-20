package sample;

public class Vehicles extends Thread{
    Main main;
    double x = 100;
    double y = 100;

    Vehicles(Main main){
        this.main = main;

    }



    public void run(){
        for (; ; ) {
            try{
                x = x - 5;
                drive(x, y);
                Thread.sleep(40);
            }catch (InterruptedException ex){

            }
        }
    }
    public void reservation(){

    }

    public void startLoading(){

    }

    public void drive(double x, double y){
        main.moveSmallVehicle1(x, y);
    }

    public void changeXY(){


            for (int i = 0; i < 100; i++) {
                try {
                    x = x - 2;
                    drive(x, y);
                    Thread.sleep(200);
                }catch (InterruptedException ex){

                }
            }
    }

    public void checkReservation(){

    }

    public void stopLoading(){

    }

    public void smallVehicle(){

    }

    public void largeVehicle(){

    }


}
