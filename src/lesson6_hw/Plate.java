package lesson6_hw;

public class Plate {
    private int foodPlate;

    public Plate(int foodPlate) {
        this.foodPlate = foodPlate;
    }

    @Override
    public String toString() {
        return "В миске " + foodPlate + " мясных фрикаделек.";
    }

    public boolean decreasedFood (int x) {
        if (foodPlate < x) {
            return false;
        } else {
            foodPlate -= x;
            return true;
        }
    }
}
