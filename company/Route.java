package com.company;

import java.util.ArrayList;

public class Route {

    private ArrayList<Destination> destinations = new ArrayList<Destination>();

    public ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<Destination> destinations) {
        this.destinations = destinations;
    }
}
