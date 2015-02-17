package core;

/**
 * Created by asangaw on 2/17/2015.
 */

public class Circle implements Shape {

    private int r;
//calclate the area
    @Override
    public double calculateArea() {
        return 22 / 7 * r * r;
    }
}
