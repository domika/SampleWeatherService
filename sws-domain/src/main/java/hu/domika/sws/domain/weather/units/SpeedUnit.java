package hu.domika.sws.domain.weather.units;

/**
 * SI units for speed.
 * @author Balazs_Domonkos
 */
public enum SpeedUnit {
    KILOMETRES_PER_HOUR("km/h"), MILES_PER_HOUR("mph");

    private final String value;

    SpeedUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
