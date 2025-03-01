import java.util.Scanner;

class Car {
    
    private String brand;
    private String model;
    private double price;

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Brand of the Car: ");
        brand = scan.nextLine();

        System.out.print("Enter the Model of the Car: ");
        model = scan.nextLine();

        System.out.print("Enter the Price of the Car: ");
        price = scan.nextDouble();

        scan.close(); 
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.input();
        car.display();
    }
}
