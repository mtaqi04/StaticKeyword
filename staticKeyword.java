
public class staticKeyword {
    public static void main(String[] args) {
        Car car1 = new Car("Geoff", "Jaguar");
        Car car2 = new Car("Geof", "Lamborghini");

        // Print individual car details
        car1.printCarDetails();
        car2.printCarDetails();
        // Print total car count
        Car.printCarCount();

        // Modify car count using static method
        Car.setCarCount(5);
        Car.printCarCount();

        Car car3 = new Car("Charlie", "Ferrari");
        Car.printCarCount(); // Print after creating another car
    }
}