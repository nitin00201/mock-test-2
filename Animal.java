public class Animal {
    public void makeSound() {
        System.out.println("I am an animal!");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moooo!");
    }
}
