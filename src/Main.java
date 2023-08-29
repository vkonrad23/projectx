import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        boolean isNameVlad = name.contains("Vlad");

        if(isNameVlad)
        {
            System.out.println("I was waiting for you, Vlad!");
        }

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        System.out.println("Hello, " + name);
        System.out.println("Damn, you're "  + age);
    }
}