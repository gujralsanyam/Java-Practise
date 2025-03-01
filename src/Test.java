
class Animal {
    private String name;
    private String sound;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal Sound");
    }
}
    class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        public void makeSound() {
            System.out.println("Woof");
        }
    }

public  class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Woof");
        Dog dog = new Dog("Puppy");
        dog.makeSound();

    }
}





