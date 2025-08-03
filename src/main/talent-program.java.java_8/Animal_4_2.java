abstract class Animal{
    String name;
    int age;

    //create constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
    public void displayInfo(){
        System.out.println("This is animal "+ name + " and "+ age + " years old.");

    }
    public void feed(){
        System.out.println("This is feed");

    }
}

class Lion extends Animal{
    void makeSound() {
        System.out.println("The lion says: growl");
    }
    public Lion(String name, int age){
        super(name,age);
    }
    public void feed(){
        System.out.println("This is lion feed.");

    }
}

class Elephant extends Animal{
    void makeSound() {
        System.out.println("The elephant says: rumble");
    }
    //constructor call
    public Elephant(String name, int age){
        super(name,age);
    }
    public void feed(){
        System.out.println("This is elephant feed.");

    }
}

public class Animal_4_2 {
    static class Zoo{
        public static void main(String[] args) {
            Animal[] myAnimalList = new Animal[2];
            myAnimalList[0] = new Lion("lion",10);
            myAnimalList[1] = new Elephant("elephant",13);

            for(Animal a :myAnimalList){
                a.displayInfo();
                a.makeSound();
                a.feed();
            }
            }
        }

}
