package hu.domika.sws.domain.weather;

import hu.domika.sws.domain.weather.units.PressureUnit;

/**
 * DTO for pressure data.
 * @author Balazs_Domonkos
 */
public class Pressure {
    private int value;
    private PressureUnit unit;

    public Pressure(int value) {
        this.value = value;
        this.unit = PressureUnit.HPA;
    }

    public int getValue() {
        return value;
    }

    public PressureUnit getUnit() {
        return unit;
    }
}
