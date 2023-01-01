package Tasks_01_11_Robot;

public class RobotDemo {

    public static void main(String[] args) {

        Robot myRobo1 = new Robot("Alice");
        myRobo1.sayHello();
        myRobo1.sayYourName();

        Robot myRobo2 = new Robot("SIRI");
        myRobo2.sayHello();
        myRobo2.sayYourName();

        Robot myRobo3 = new Robot("Marusia");
        myRobo3.sayHello();
        myRobo3.sayYourName();
        // Попробуем модифицировать имя робота напрямую через доступ к переменной класса.
        myRobo3.name = "Nadezhda";
        myRobo3.sayYourName();

    }

}
