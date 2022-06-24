package Objects;

public class Car {
    int carVin;
    String carName = "BMW";
    byte doorsNumber = 4;
    byte carWheelsNumber = 4;
    double carMarketValue = 65;

    public Car(int carVin, String carName, byte doorsNumber, double carMarketValue) {
        this.carVin = carVin;
        this.carName = carName;
        this.doorsNumber = doorsNumber;
        this.carWheelsNumber = carWheelsNumber;
        this.carMarketValue = carMarketValue;
    }
}
