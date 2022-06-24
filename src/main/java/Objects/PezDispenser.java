package Objects;

public class PezDispenser {
    int candyCount = 10;
    int currentCandyAmount;
    String name;

    public PezDispenser(String name) {
        this.name = name;
        this.currentCandyAmount = this.candyCount;
    }
}
