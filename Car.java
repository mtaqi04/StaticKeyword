public class Car {
    String name;
    String make;
    static int carCount = 0; // Static variable to track total car count

    public Car(String name, String make) {
        this.name = name;
        this.make = make;
        carCount++; // Increment the car count whenever a new Car is created
    }
    // Static method to reset car count
    public static void setCarCount(int newCount) {
        carCount = newCount;
    }
    // Instance method to print car details
    public void printCarDetails() {
        System.out.println("Car Name: " + name + ", Make: " + make);
    }
    // Static method to print total car count
    public static void printCarCount() {
        System.out.println("Total Cars: " + carCount);
    }
}
