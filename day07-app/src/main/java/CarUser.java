import com.jpmc.training.Car;

public class CarUser {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.model = "BMW";
        //bmw.yearOfMake = 2010;
        //bmw.chassisNo = "";
        SportsCar ferrari = new SportsCar();
        //ferrari.chassisNo = "";
    }
}
class SportsCar extends Car {
    public void register() {
        super.chassisNo = "sdkfjhds";
        //super.yearOfMake = 1212;
    }
}