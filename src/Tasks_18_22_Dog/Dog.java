package Tasks_18_22_Dog;

public class Dog {

    private final String name;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public void voice() {
        System.out.println("Name: " + name + "; age: " + age + ".");
    }

}
