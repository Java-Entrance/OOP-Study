public class Barista {

    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

    public int calculate(MenuItem menuItem, int price) {
        int change = price - menuItem.getPrice();

        return change;

    }
}
