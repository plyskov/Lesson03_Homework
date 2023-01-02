package Tasks_18_22_Dog;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog("Archi", 5, "Brown");
        myDog.voice();

        myDog.happyBirthday();
        myDog.voice();

        myDog.changeColor("White");
        myDog.voice();

    }
}
