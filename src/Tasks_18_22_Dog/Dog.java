package Tasks_18_22_Dog;

public class Dog {

    private final String name;
    private int age;
    private String color;

    Dog(String name, int age, String color){
        this.name  = name;
        this.age   = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Name: " + name + "; age: " + age + "; color: " + color + ".");
    }

    public void happyBirthday(){
        age++;
    }

}
