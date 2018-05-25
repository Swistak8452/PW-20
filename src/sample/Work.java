package sample;

public class Work {
    double xPlace1 = -400;
    double yPlace1 = 20;
    double xPlace2 = -300;
    double yPlace2 = 20;
    double xPlace3 = -200;
    double yPlace3 = 20;
    double xPlace4 = -100;
    double yPlace4 = 20;
    double xPlace5 = 0;
    double yPlace5 = 20;
    double xPlace6 = 100;
    double yPlace6 = 20;
    double xPlace7 = 200;
    double yPlace7 = 20;
    double xPlace8 = 300;
    double yPlace8 = 20;
    double xPlace9 = 400;
    double yPlace9 = 20;
    double xPlace10 = 500;
    double yPlace10 = 20;
    boolean tableOfPlaces[] = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};


    public void places(){

    }

    public boolean checkPlace(int placeNumber) {
        if(tableOfPlaces[placeNumber]){
            tableOfPlaces[placeNumber] = false;
            return true;
        }else{
            return false;
        }

    }

    public boolean reservePlace(int placeNumber) {
        return checkPlace(placeNumber);
    }

    public void Reservations(){

    }
}
