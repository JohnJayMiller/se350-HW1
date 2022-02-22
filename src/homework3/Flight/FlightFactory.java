package homework3.Flight;

import homework3.Airline.Airline;
import homework3.Airport.Airport;

import java.util.Date;

public class FlightFactory {
    private FlightFactory(){

    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, Date departureTime, int capacity){
        if (type.equals("commercialFlight")) {
            try {

                return new CommercialFlight(airline, origin, destination,departureTime);
            } catch(IllegalArgumentException e) {
                return null;
            }
        }
        else if (type.equals("PassangerFlight")){
           // try{
               return new PassangerFlight(capacity);
            //} catch(IllegalArgumentException e){
            //   return null;
           // }
        }
        else return null;
    }
}

