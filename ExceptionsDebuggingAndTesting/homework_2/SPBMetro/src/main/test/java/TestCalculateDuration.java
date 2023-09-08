import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCalculateDuration extends TestCase {

    public StationIndex stationIndex = new StationIndex();

    protected List<Station> route;


    @Override
    protected void setUp() throws Exception {
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);

        Line line1 = new Line(1, "первая");
        Line line2 = new Line(2, "вторая");
        Line line3 = new Line(3, "третья");


        Station station1 = new Station("станция 1", line1);
        Station station2 = new Station("станция 2", line1);
        Station station3 = new Station("станция 3", line2);
        Station station4 = new Station("станция 4", line2);
        Station station5 = new Station("станция 5", line3);
        Station station6 = new Station("станция 6", line3);

        line1.addStation(station1);
        line1.addStation(station2);
        line2.addStation(station3);
        line2.addStation(station4);
        line3.addStation(station5);
        line3.addStation(station6);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);



        stationIndex.addConnection(Arrays.asList(station2, station3));
        stationIndex.addConnection(Arrays.asList(station4, station5));

        route = routeCalculator.getShortestRoute(station1, station6);


    }

    public void testCalculateDuration() {
        System.out.println(route);
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 14.5;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {

    }
}
