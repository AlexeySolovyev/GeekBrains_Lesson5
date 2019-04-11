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
            System.out.println(this.name + " пробежал " + disctance + " метров");
        }
        else {
            System.out.println(this.name + " не сможет пробежать столько!");
        }
    }

    public void swim(int distance) {
        if (swimLimit > 0 && distance <= swimLimit) {
            System.out.println(this.name + " пробежал " + distance + " метров");
        }
        else {
            System.out.println(this.name + " не может пробежпть столько!");
        }
    }

    public void jump(double height) {
        if (jumpLimit > 0 && height <= jumpLimit) {
            System.out.println(this.name + " подпрыгнул на " + height + " метров");
        }
        else {
            System.out.println(this.name + " не сможет прыгнуть так высоко!");
        }
    }
}
