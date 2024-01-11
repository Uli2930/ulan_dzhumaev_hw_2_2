public abstract class Car implements Printable{
    private String mark;
    private int price;
    private String countryMade;

    public Car(String mark, int price, String countryMade) {
        this.mark = mark;
        this.price = price;
        this.countryMade = countryMade;
    }

    public String getMark() {
        return mark;
    }

    public int getPrice() {
        return price;
    }

    public String getCountryMade() {
        return countryMade;
    }
}
