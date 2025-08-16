public class ConcentrationException extends Exception{
    //props
    int c;

    //constructors

    public ConcentrationException(int c,String message) {
        super(message);
        this.c = c;
    }

    public int getConc() {
        return c;
    }
}
