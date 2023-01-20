package it.develhope.encapsulation2;

public class Person{
    private String name;
    private String surname;
    private float height;
    private int age;

    public String stringValidation(String getSomething){
        this.setSurname(getSomething);
        this.setName(getSomething);
        try {
            int i = Integer.parseInt(getSomething);
            System.out.println(i + " is not a string");
            System.exit(0);
        }catch (NumberFormatException e){
             return getSomething;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
