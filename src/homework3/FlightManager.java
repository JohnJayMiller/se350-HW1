package homework3;

import homework3.Airline.Airline;
import homework3.Airport.Airport;
import homework3.Flight.Flight;
import homework3.Flight.FlightFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public final class FlightManager {
    private static FlightManager ourInstance;
    private static List<Flight> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }
    private FlightManager() {
        flights = new ArrayList<Flight>();
    }
    public String createFlight(String type, Airline airline, Airport origin, Airport destination, Date departureTime, int capacity){
        Flight flight = FlightFactory.createFlight(type,airline,origin,destination, departureTime,capacity);
        flights.add(flight);

        return flight.getFlightNumber();
    }
    public Optional<Flight> getFlightByFlightNumber(String flightNumber){
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}
