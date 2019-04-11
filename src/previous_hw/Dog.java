package previous_hw;

public class Dog extends Animal{
    public Dog(String name) {
        super("Собако" + name);
        this.runLimit = 300;
        this.jumpLimit = 1;
        this.swimLimit = 15;
    }
}
