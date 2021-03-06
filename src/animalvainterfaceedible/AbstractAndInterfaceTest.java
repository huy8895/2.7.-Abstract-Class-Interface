package animalvainterfaceedible;

import animalvainterfaceedible.animal.Animal;
import animalvainterfaceedible.animal.Chicken;
import animalvainterfaceedible.animal.Tiger;
import animalvainterfaceedible.edible.Edible;
import animalvainterfaceedible.fruit.Apple;
import animalvainterfaceedible.fruit.Fruit;
import animalvainterfaceedible.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                System.out.println(((Chicken)animal).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
