public class MenuItem {

    private String name;
    private int price;

    public MenuItem(String name) {
        this.name = name;
        switch (name) {
            case "americano":
                this.price = 1500;
                break;
            case "cappuccino":
                this.price = 2000;
                break;
            case "caramel", "espresso":
                this.price = 2500;
                break;
            default:
                System.out.println("존재하지 않는 메뉴입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
