public class CoffeeMaker {
    Coffee makeCoffee() {
        System.out.println("Make a Coffee!");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(c , t);

        return coffee;
    }
}
