package Task_02;

import java.util.Scanner;

public class StringsDemo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please type your name: ");
        String myName = userInput.nextLine();

        System.out.println("Hello " + myName + "!");

    }

}
