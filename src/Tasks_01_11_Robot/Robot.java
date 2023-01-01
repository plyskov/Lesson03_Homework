package Tasks_01_11_Robot;

public class Robot {

    String name;

    Robot(String robotName){
        this.name = robotName;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + this.name + ".");
    }

}
