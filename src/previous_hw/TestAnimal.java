package previous_hw;

public class TestAnimal {

    public static void main(String[] args) {
        Animal[] arrayOfAnimals = new Animal[3];

        arrayOfAnimals[0] = new Cat(" Барсик");
        arrayOfAnimals[1] = new Dog(" Шарик");
        arrayOfAnimals[2] = new SuperCat(" Федька-спортсмен", 800, 5);

        for (Animal animal : arrayOfAnimals) {
            animal.run(150);
            animal.jump(2.5);
            animal.swim(5);
        }
    }
}
