package homework1;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import static java.util.UUID.randomUUID;


public class Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private final String flightNumber;
    private Date departureTime;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline:", getAirline()));
        sb.append(String.format("%-20s %s%n", "Origin:", getOrigin()));
        sb.append(String.format("%-20s %s%n", "destination:", getDestination()));
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Departure Time:", getDepartureTime()));
        return sb.toString();
    }

    public Flight(Airline airline, Airport origin, Airport destination, Date departureTime) throws IllegalArgumentException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        flightNumber= String.valueOf(randomUUID());
        setDepartureTime(departureTime);
    }


    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) throws NullPointerException {
        if (airline == null) {
            throw new NullPointerException("Airline cannot be null");
        }
        this.airline = airline;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) throws NullPointerException {
        if (origin == null) {
            throw new NullPointerException("Origin cannot be null");
        }
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) throws NullPointerException {
        if (destination == null) {
            throw new NullPointerException("Destination cannot be null");
        }
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}


