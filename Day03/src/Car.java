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
