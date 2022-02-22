package homework3.Airport;
import homework3.Airport.Airport;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {

    private static Map<String, Airport> airportCache = new HashMap<>();

    private AirportFactory() {}

    public static Airport getAirport(String string) {
        return airportCache.computeIfAbsent(string, newstring -> {
            return new Airport(string);
        });
    }

}
