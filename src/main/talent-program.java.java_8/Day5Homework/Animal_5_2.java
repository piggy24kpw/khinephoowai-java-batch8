package Day5Homework;
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog says: bow wow");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("The cat says: meow meow");
    }
}

public class Animal_5_2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();

    }
}
