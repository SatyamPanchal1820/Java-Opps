import java.util.*;

class Car {
    int CarId;
    String CarType;

    public Car(int CarId, String CarType) {
        this.CarId = CarId;
        setCarType(CarType);
    }

    public void setCarType(String carType) {

        if (carType.equals("Small") || carType.equals("Van") || carType.equals("SUV")) {
            this.CarType = carType;
        } else {
            System.out.println("Invalid Car Type. Setting to default (Small).");
            this.CarType = "Small";
        }
    }

    public int GetRent() {
        if (CarType.equals("Small"))
            return 1000;
        else if (CarType.equals("Van"))
            return 800;
        else if (CarType.equals("SUV"))
            return 2500;
        else
            return 0;
    }

    public void ShowCar() {

        if (CarType.equals("Small")) {
            System.out.println("Small(" + CarId + ", " + GetRent() + ")");
        } else if (CarType.equals("Van")) {
            System.out.println("Van(" + CarId + ", " + GetRent() + ")");
        } else if (CarType.equals("SUV")) {
            System.out.println("SUV(" + CarId + ", " + GetRent() + ")");
        }
    }
}

public class Carrental {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Id: ");
        int carId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Car Type (Small/Van/SUV): ");
        String carType = sc.nextLine();

        Car ob = new Car(carId, carType);
        ob.ShowCar();
    }
}
