public class TemperatureException extends Exception{
    //props
    int t;

    //init(constructor)

    public TemperatureException(int t, String message) {
        super(message);
        this.t = t;
    }
    //getter

    public int getTemp() {
        return t;
    }
}
