package hu.domika.sws.domain.weather.units;

/**
 * SI units for atmospheric pressure.
 * @author Balazs_Domonkos
 */
public enum PressureUnit {
    HPA("hPa"), MMHG("mmHg");

    private final String value;

    PressureUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
