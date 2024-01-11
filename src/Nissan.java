public class Nissan extends Car implements Printable{
    private int age;

    public Nissan(String mark, int price, String countryMade, int age) {
        super(mark, price, countryMade);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Mark " + getMark() +
                "\nPrice " + getPrice() +
                "\nCountryMade " + getCountryMade() +
                "\nAge " + getAge());
        System.out.println("-------------");

    }



    public int getAge() {
        return age;
    }
}
