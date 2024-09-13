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

class AnimalMov {
    public void move() {
        System.out.println("Animal moves.");
    }
}

class Fish extends AnimalMov {
    public void move() {
        System.out.println("Fish swims.");
    }
}

class Bird extends AnimalMov {
    public void move() {
        System.out.println("Bird flies.");
    }
}

class Dog extends AnimalMov {
    public void move() {
        System.out.println("Dog runs.");
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