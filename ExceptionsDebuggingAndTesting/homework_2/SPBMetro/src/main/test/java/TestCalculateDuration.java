import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCalculateDuration extends TestCase {

    public StationIndex stationIndex = new StationIndex();

    protected List<Station> routeTwoConnection = new ArrayList<Station>();

    protected List<Station> routeOnTheLine = new ArrayList<Station>();

    protected List<Station> routeOneConnection = new ArrayList<Station>();

    protected List<Station> routeTwoConnectionExpected = new ArrayList<Station>();

    protected List<Station> routeOnTheLineExpected = new ArrayList<Station>();

    protected List<Station> routeOneConnectionExpected = new ArrayList<Station>();


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

        routeTwoConnection = routeCalculator.getShortestRoute(station1, station6);

        routeOnTheLine = routeCalculator.getShortestRoute(station1, station2);

        routeOneConnection = routeCalculator.getShortestRoute(station1, station3);

        routeOnTheLineExpected.add(station1);
        routeOnTheLineExpected.add(station2);

        routeOneConnectionExpected.add(station1);
        routeOneConnectionExpected.add(station2);
        routeOneConnectionExpected.add(station3);

        routeTwoConnectionExpected.add(station1);
        routeTwoConnectionExpected.add(station2);
        routeTwoConnectionExpected.add(station3);
        routeTwoConnectionExpected.add(station4);
        routeTwoConnectionExpected.add(station5);
        routeTwoConnectionExpected.add(station6);
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(routeTwoConnection);
        double expected = 14.5;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {
        assertEquals(routeOnTheLineExpected, routeOnTheLine);
    }

    public void testGetRouteWithOneConnection() {
        assertEquals(routeOneConnectionExpected, routeOneConnection);
    }

    public void testGetRouteWithTwoConnections() {
        assertEquals(routeTwoConnectionExpected, routeTwoConnection);
    }

}
