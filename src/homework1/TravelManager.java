package homework1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TravelManager {
    public static void main(String[] args) {
        Airline airline = new Airline("dog air");
        Airport oAirport = new Airport("DFW");
        Airport dAirport = new Airport("MDW");
        Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Flight flight = new Flight(airline,oAirport,dAirport,date);
        System.out.println(flight);
    }
}
