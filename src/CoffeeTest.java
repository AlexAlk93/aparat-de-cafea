public class CoffeeTest {
    public static void main(String[] args) {

        CoffeeMaker mk          = new CoffeeMaker();
        DrinkCoffee drink = new DrinkCoffee();

        for (int i = 0; i < 5 ; i++) {
            Coffee coffee = mk.makeCoffee();
            System.out.println("Cafea numarul: " + i + "");

            try {
                drink.drinkCoffee(coffee);
            } catch (TemperatureException e) {
                System.out.println("Exception: " + e.getMessage() + "\ntemp: " + e.getTemp());
            }catch (ConcentrationException e) {
                System.out.println("Exception: " + e.getMessage() + "\nconc: " + e.getConc());
            }
            finally {
                System.out.println("Curatare aparat cafea!");
                System.out.println();
            }

        }


    }
}
