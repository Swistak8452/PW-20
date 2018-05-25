package sample;

public class Reservations {
    int tableOfPlaces[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int checkReservation(int placeNumber) {
        return tableOfPlaces[placeNumber];
    }

    public int lockPlace(int placeNumber, int vehicleNumber) {
        return tableOfPlaces[placeNumber] = vehicleNumber;
    }

    public int unlockPlace(int placeNumber, int vehicleNumber) {
        return tableOfPlaces[placeNumber] = 0;
    }
}
