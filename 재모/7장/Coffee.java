public class Coffee {

    private String name;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
    }

    public String getName() {
        return name;
    }
}
