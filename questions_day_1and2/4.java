package questions_day_1and2;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal2.makeSound();
        animal3.makeSound();
    }
}

