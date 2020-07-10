package lythuyet.baidoclopobject.animal;

public class DogTestDrive {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Dog dog = new Dog();
        animalList.add(dog);

        Animal animal = animalList.get(0);
        Dog dog2 = (Dog) animal;

    }
}
