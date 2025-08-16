public class DrinkCoffee {
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException {

        //if for temp
        if(c.getTemp() > 65) {
           throw new TemperatureException(c.getTemp(),"Coffee is hot!");
        }
        //if for conc
        if (c.getConc() > 55 ) {
            throw new ConcentrationException(c.getConc(),"Coffe concentration is too high!");
        }
    }
}
