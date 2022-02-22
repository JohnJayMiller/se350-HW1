package homework3.Flight;

import homework3.Flight.Flight;

import static java.util.UUID.randomUUID;

public class PassangerFlight implements Flight {
    private int passengerCapacity;
    private final String flightNumber;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %n", "Passenger Flight"));
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Capacity:", getPassengerCapacity()));
        return sb.toString();
    }

    public PassangerFlight(int passengerCapacity){
        setPassengerCapacity(passengerCapacity);
        flightNumber= String.valueOf(randomUUID());

    }


    @Override
    public String getFlightNumber() {return flightNumber;}

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) throws IllegalArgumentException{
        if (passengerCapacity<=0){
           throw new IllegalArgumentException("Passenger Number Must be Nonzero");
        }
        this.passengerCapacity = passengerCapacity;
    }
}
