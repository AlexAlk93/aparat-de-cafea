public class Coffee {
    //props
    private int temp;
    private int conc;

    //constructor (init)
    Coffee(int t, int c) {
        temp = t;
        conc = c;
    }

    //getter

    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temp=" + temp +
                ", conc=" + conc +
                '}';
    }
}
