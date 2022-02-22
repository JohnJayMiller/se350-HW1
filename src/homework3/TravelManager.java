package homework3;

import homework3.Airline.Airline;
import homework3.Airline.AirlineFactory;
import homework3.Airport.Airport;
import homework3.Airport.AirportFactory;
import homework3.Flight.Flight;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Optional;

public class TravelManager {
    public static void main(String[] args) throws Exception {
        try {
            Airline airline = AirlineFactory.getAirline("dog air");

            Airport oAirport = AirportFactory.getAirport("DFW");
            Airport dAirport = AirportFactory.getAirport("MDW");
            Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
            int test = 1;

            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, oAirport, dAirport, date,test);
            String flightNumber2 = FlightManager.getInstance().createFlight("PassangerFlight", airline, oAirport, dAirport, date,test);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);
            Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber2);
            System.out.println(flight.get());
            System.out.println(flight2.get());
        } catch (NullPointerException ex) {
            ex.printStackTrace();


        }
    }
}
