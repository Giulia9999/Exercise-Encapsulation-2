package it.develhope.encapsulation2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Person person = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the name of the person: ");
        person.setName(scanner.nextLine());
        person.stringValidation(person.getName());
        System.out.printf("Tha name of the person is %s %n",person.getName());

        System.out.print("Insert the surname of the person: ");
        person.setSurname(scanner.nextLine());
        person.stringValidation(person.getSurname());
        System.out.printf("The surname of the person is %s %n",person.getSurname());


        System.out.print("Insert the height of the person: ");
        if(scanner.hasNextFloat()){
            person.setHeight((scanner.nextFloat()));
            System.out.printf("Tha height of the person is %s %n", person.getHeight());
        }else{
            System.out.println("Not a number");
            return;
        }

        System.out.print("Insert the age of the person: ");
        if(scanner.hasNextInt()){
            person.setAge((scanner.nextInt()));
            System.out.printf("Tha age of the person is %s %n", person.getAge());
        }else{
            System.out.println("Not a number");
        }
    }
}
