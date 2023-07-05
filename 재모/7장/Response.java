public class Response {

    private Coffee coffee;
    private int change;

    public Response(Coffee coffee, int change) {
        this.coffee = coffee;
        this.change = change;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getChange() {
        return change;
    }
}
