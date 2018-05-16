package hu.domika.sws.domain.weather.units;

/**
 * SI units for temperature.
 * @author Balazs_Domonkos
 */
public enum TemperatureUnit {
    CELSIUS("℃"), FAHRENHEIT("℉");

    private final String value;

    TemperatureUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
