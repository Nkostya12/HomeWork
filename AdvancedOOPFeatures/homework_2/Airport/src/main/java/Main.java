import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
      Date dateNow =  new Date();
        long twoHours = 7_200_000L;
        ArrayList<Flight> endTwoHours = new ArrayList<>();
        airport.getTerminals().forEach(terminal -> terminal.getFlights().stream().
                filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE)).
                filter(flight -> flight.getDate().getTime() - dateNow.getTime() <= twoHours && flight.getDate().after(dateNow)).
                forEach(flight -> endTwoHours.add(flight)));
        return endTwoHours;
    }

}