package hu.domika.sws.domain.weather;

/**
 * DTO for Wind data.
 * @author Balazs_Domonkos
 */
public class Wind {
    private Speed speed;
    private int direction;

    public Wind(Speed speed, int direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public Speed getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }
}
