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
        Date dateNow = new Date();
        long hours = 7200000L;
        ArrayList<Flight> endTwoHours = new ArrayList<>();

        ArrayList<Terminal> terminal = new ArrayList<>();

        Stream<Terminal> stream = airport.getTerminals().stream();

        for (Terminal terminal1 : airport.getTerminals()) {
            System.out.println(terminal1.getFlights());
            for (Flight flight : terminal1.getFlights()) {
                long plus = flight.getDate().getTime() ;
                if (minus >= hours ){
                    endTwoHours.add(flight);

                }


            }
        }


        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        return endTwoHours;
    }

}