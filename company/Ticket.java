package com.company;

public class Ticket {

    private int ticketId;
    private Destination destination;
    private Train train;
    private Seat seat;
    private double price;

    public Ticket (int ticketId, Destination destination, Train train, Seat seat) {

        this.ticketId = ticketId;
        this.destination = destination;
        this.train = train;
        this.seat = seat;
        calculatePrice();
    }

    public void calculatePrice() {

        int nrOfStops = train.getRoute().getDestinations().indexOf(destination);
        price = 4 * nrOfStops;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
