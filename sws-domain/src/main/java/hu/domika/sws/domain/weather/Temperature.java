package hu.domika.sws.domain.weather;

import hu.domika.sws.domain.weather.units.TemperatureUnit;

/**
 * DTO for temperature data.
 * @author Balazs_Domonkos
 */
public class Temperature {
    private float value;
    private TemperatureUnit unit;

    public Temperature(float value) {
        this.value = value;
        this.unit = TemperatureUnit.CELSIUS;
    }

    public float getValue() {
        return value;
    }

    public TemperatureUnit getUnit() {
        return unit;
    }
}
