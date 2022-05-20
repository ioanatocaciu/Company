package com.company;

import java.util.ArrayList;

public class Station {

    private ArrayList<Train> listOfTrains = new ArrayList<Train>();
    private double profit;

    public void arrivedTrain (Train train) {

        train.setStatus("arrived");
    }

    public void departedTrain (Train train) {

        train.setStatus("departed");
    }

    public void parkedTrain (Train train) {

        train.setStatus("parked");
    }

    public void calculateProfit() {

        profit = 0.0;
        for(Train train: listOfTrains) {
            profit = profit + train.getProfit();
        }
    }

    public ArrayList<Train> getListOfTrains() {
        return listOfTrains;
    }

    public void setListOfTrains(ArrayList<Train> listOfTrains) {
        this.listOfTrains = listOfTrains;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
