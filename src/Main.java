public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[0] = createObject("Toyota");
            cars[1] = createObject("Nissan");
            cars[2] = createObject("Honda");
            cars[i].print();
        }
    }

    public static Car createObject(String className){
        Car car = null;
        switch (className){
            case "Toyota":
               car = new Toyota("Camry 35", 3000, "Japan", "4AWD");
               break;
            case "Honda":
                car = new Honda("CR-V", 3500, "Japan", 2.2);
                break;
            case "Nissan":
                car = new Nissan("GTR", 30000, "Japan", 2006);
                break;
        }
        return car;
    }
}