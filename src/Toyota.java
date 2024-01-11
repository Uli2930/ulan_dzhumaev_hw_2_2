public class Toyota extends Car implements Printable{
    private String driveUnit;

    public Toyota(String mark, int price, String countryMade, String driveUnit) {
        super(mark, price, countryMade);
        this.driveUnit = driveUnit;
    }


    @Override
    public void print() {
        System.out.println("Mark " + getMark() +
                "\nPrice " + getPrice() +
                "\nCountryMade " + getCountryMade() +
                "\nDriveUnit " + getDriveUnit());
        System.out.println("-----------------");
    }

    public String getDriveUnit() {
        return driveUnit;
    }
}
