package lesson6_hw;

public abstract class Animal {

    protected String name;
    protected int eatLimit = 0;

    public Animal() {
        this.name = "Безымянный";
    }

    public Animal(String name) {
        this.name = name;
    }


    public void eat(int food) {
        if (eatLimit > 0 && food <= eatLimit) {
            System.out.println(this.name + " сожрал " + food + " кило");
        }
        else {
            System.out.println(this.name + " не сможет съесть столько");
        }
    }
}
