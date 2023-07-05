import java.util.ArrayList;

public class Main {

    private static final int HAS_MONEY = 3000;
    private static final String[] menuNames = {"americano", "cappuccino", "caramel", "espresso"};

    public static void main(String[] args) {
        Menu menu = makeMenu();
        Customer customer = new Customer(HAS_MONEY);
        Barista barista = new Barista();
        Response response = customer.order("cappuccino", menu, barista);
        printResponse(response);

    }

    private static Menu makeMenu() {
        ArrayList<MenuItem> items = new ArrayList<>();
        for (String menuName : menuNames) {
            items.add(new MenuItem(menuName));
        }
        return new Menu(items);
    }

    private static void printResponse(Response response) {
        System.out.println("coffee name = " + response.getCoffee().getName());
        System.out.println("change = " + response.getChange());
    }
}