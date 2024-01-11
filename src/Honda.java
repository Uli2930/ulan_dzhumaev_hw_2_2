public class Honda extends Car implements Printable{
    private double engine;

    public Honda(String mark, int price, String countryMade, double engine) {
        super(mark, price, countryMade);
        this.engine = engine;
    }

    @Override
    public void print() {
        System.out.println("Mark " + getMark() +
                "\nPrice " + getPrice() +
                "\nCountryMade " + getCountryMade() +
                "\nEngine " + getEngine());
        System.out.println("-------------");

    }


    public double getEngine() {
        return engine;
    }
}
