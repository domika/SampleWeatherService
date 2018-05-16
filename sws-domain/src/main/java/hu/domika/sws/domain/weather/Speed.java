package hu.domika.sws.domain.weather;

import hu.domika.sws.domain.weather.units.SpeedUnit;

/**
 * DTO for speed data.
 * @author Balazs_Domonkos
 */
public class Speed {
    private SpeedUnit unit;
    private float value;

    public Speed(float value) {
        this.value = value;
        this.unit = SpeedUnit.KILOMETRES_PER_HOUR;
    }

    public SpeedUnit getUnit() {
        return unit;
    }

    public float getValue() {
        return value;
    }
}
