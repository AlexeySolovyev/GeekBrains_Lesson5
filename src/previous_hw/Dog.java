package previous_hw;

public class Dog extends Animal{

    public Dog(String name) {
        super("Собако" + name);
        this.runLimit = 500;
        this.jumpLimit = 0.5;
        this.swimLimit = 10;
    }
}
