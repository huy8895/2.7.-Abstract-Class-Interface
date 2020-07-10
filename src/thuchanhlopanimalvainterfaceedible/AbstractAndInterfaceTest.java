package thuchanhlopanimalvainterfaceedible;

import thuchanhlopanimalvainterfaceedible.animal.Animal;
import thuchanhlopanimalvainterfaceedible.animal.Chicken;
import thuchanhlopanimalvainterfaceedible.animal.Tiger;
import thuchanhlopanimalvainterfaceedible.edible.Edible;
import thuchanhlopanimalvainterfaceedible.fruit.Apple;
import thuchanhlopanimalvainterfaceedible.fruit.Fruit;
import thuchanhlopanimalvainterfaceedible.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
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
