package Laborator_1;

public class Student {
    private final String name;
    private final String gender;
    private final Integer age;
    public Student(String name, String gender, Integer age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void displayStudent(){
        System.out.println(name + gender + age);
    }
}