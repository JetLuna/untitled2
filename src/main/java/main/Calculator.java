package main;

import static java.lang.Math.*;

public class Calculator {
    public double calcB(double z) {
        return (1 + (z*z)) / (3 + (z*z)/5.0);
    }

    //
    public double calcA(double x, double y) {
        double sin = sin(y);
        return (2 * cos(x-(PI / 6)) / (1.0/2.0 + sin * sin));
    }
}
