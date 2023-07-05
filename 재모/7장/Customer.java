public class Customer {

    private int money;

    public Customer(int money) {
        this.money = money;
    }

    public Response order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.findMenuItem(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
        int change = barista.calculate(menuItem, this.money);
        return new Response(coffee, change);
    }
}
