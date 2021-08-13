//All class names begin with Uppercase
//All variables begin with lowercase
//All methods begin with lowercase
//Naming follows camelCase notation
//getYearOfMake(), getModel(), setYearOfMake()
//All classes are public
//All member variables are defined as private
//Provide access to them using public getters/setters
public class Car {
    private String model;
    private int yearOfMake;

    public Car(String model, int yearOfMake) {
        this.model = model;
        this.yearOfMake = yearOfMake;
    }

    //Accessors for your variables
    //getter setter properties
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}
