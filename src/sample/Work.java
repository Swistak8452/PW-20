package sample;

import java.util.Date;

public class Work {
    Date date1, date2, date3, date4, date5, date6, date7, date8, date9, date10;
    long time1, time2, time3, time4, time5, time6, time7, time8, time9, time10;

    public long chooseTime(int vehicleNumber){
        if (vehicleNumber == 1) {
            return time1;
        } else if (vehicleNumber == 2) {
            return time2;
        } else if (vehicleNumber == 3) {
            return time3;
        } else if (vehicleNumber == 4) {
            return time4;
        } else if (vehicleNumber == 5) {
            return time5;
        } else if (vehicleNumber == 6) {
            return time6;
        } else if (vehicleNumber == 7) {
            return time7;
        } else if (vehicleNumber == 8) {
            return time8;
        } else if (vehicleNumber == 9) {
            return time9;
        } else if (vehicleNumber == 10) {
            return time10;
        } else {
            return time1;
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


}
