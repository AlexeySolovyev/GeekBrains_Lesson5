package lesson6_hw;

public class TestAnimal {

    public static void main(String[] args) {

        Animal[] arrayOfAnimals = new Animal[4];

        arrayOfAnimals[0] = new Cat(" Барсик");
        arrayOfAnimals[1] = new Cat(" Пушок");
        arrayOfAnimals[2] = new Cat(" Бычок");
        arrayOfAnimals[3] = new Cat(" Мурзик");

        for (Animal animal : arrayOfAnimals) {
            animal.eat(8);
        }
    }
}
