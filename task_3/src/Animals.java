package task_3.src;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Гав!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Мууууу!");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
