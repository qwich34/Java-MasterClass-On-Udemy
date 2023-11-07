package dev.lpa;

import java.util.Comparator;

public class Place {
    private String town;
    private int distance;

    public Place(String town, int distance) {
        this.town = town;
        this.distance = distance;
    }
    public String getTown() {
        return town;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "[town = " + town + ", distance = " + distance + "]";
    }
}
class MinDistanceComparator implements Comparator<Place>{
    public int compare(Place a, Place b) {

        int distance1 = a.getDistance();
        int distance2 = b.getDistance();
        if (distance1 < distance2)
            return -1;
        else if (distance1 == distance2)
            return 0;
        else
            return 1;
    }
}

class MaxDistanceComparator implements Comparator<Place>{
    public int compare(Place a, Place b) {

        int distance1 = a.getDistance();
        int distance2 = b.getDistance();
        if (distance1 > distance2)
            return -1;
        else if (distance1 == distance2)
            return 0;
        else
            return 1;
    }
}
