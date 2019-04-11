package previous_hw;

public abstract class Animal {
    protected String name;

    protected int runLimit = 0;
    protected double jumpLimit = 0;
    protected int swimLimit = 0;

    public Animal() {
        this.name = "Безымянный";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run (int disctance) {
        if (runLimit > 0 && disctance <= runLimit) {
            System.out.println(this.name + " пробежал" + disctance + " метров");
        }
        else {

        }
    }
}
