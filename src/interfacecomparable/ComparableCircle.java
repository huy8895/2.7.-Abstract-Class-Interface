package interfacecomparable;

import interfaceresizeable.shape.Circle;

import java.util.Comparator;

public class ComparableCircle extends Circle
        implements Comparator<ComparableCircle> {

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o){
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
