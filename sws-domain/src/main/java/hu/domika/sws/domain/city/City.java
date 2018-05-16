package hu.domika.sws.domain.city;

/**
 * DTO for City related data.
 * @author Balazs_Domonkos
 */
public class City {
    private String name;
    private String countryCode;
    private double latitude;
    private double longitude;

    public City(String name, String countryCode, double latitude, double longitude) {
        this.name = name;
        this.countryCode = countryCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
