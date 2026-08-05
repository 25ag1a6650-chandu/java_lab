class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}