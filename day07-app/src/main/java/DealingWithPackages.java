//import com.jpmc.training.Car;
//import com.jpmc.training.CarMechanic;

//import com.jpmc.training.*; //NOT RECOMMENDED AT ALL

//IDE works for you. Nothing to worry about!!
import com.jpmc.training.Car;
import com.jpmc.training.CarMechanic;
import static com.jpmc.training.Month.*;

import static com.jpmc.training.CarUtil.*;
//import static com.jpmc.training.*;

public class DealingWithPackages {
    public static void main(String[] args) {
        Car car = new Car();
        CarMechanic mechanic = new CarMechanic();
//        CarUtil.printCarDetails();
//        CarUtil.printInsuranceDetails();
        printCarDetails();
        printInsuranceDetails();
//        System.out.println(Month.JAN);
//        System.out.println(Month.FEB);
//        System.out.println(Month.MAR);
        System.out.println(JAN);
        System.out.println(FEB);
        System.out.println(MAR);
    }
}
