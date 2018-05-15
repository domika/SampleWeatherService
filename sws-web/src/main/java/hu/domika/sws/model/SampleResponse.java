package hu.domika.sws.model;

/**
 * @author Balazs_Domonkos
 */
public class SampleResponse {

    private String message;

    public SampleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
