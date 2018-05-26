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

    public void lockAll() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                lockPlace(i, j);
            }
        }

    }

    public void unlockAll() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                unlockPlace(i, j);
            }
        }
    }
}
