package l2810;

public class Car {
    private String name, model, carNumber;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getYear() {
        return year;
    }

    private int year;

    public Car(String name, String model, String carNumber, int year) {
        this.name = name;
        this.model = model;
        this.carNumber = carNumber;
        this.year = year;
    }
}
