package it.develhope.encapsulation2;

public class Person{
    private String name;
    private String surname;
    private float height;
    private int age;

    public String stringValidation(String getSomething){
        try {
            int i = Integer.parseInt(getSomething);
            System.out.println(i + " is not a string");
            System.exit(0);
        }catch (NumberFormatException e){
             return getSomething;
        }
        return null;
    }

    public void getData(String name, String surname, float height, int age ){
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.age = age;
    }
    public void setData(){
        System.out.printf("Tha name of the person is %s %n", name);
        System.out.printf("Tha surname of the person is %s %n", surname);
        System.out.printf("Tha height of the person is %s %n", height);
        System.out.printf("Tha age of the person is %s %n", age);
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

    public float getHeight() {
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
