package Bai4;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String className;
    public Student () {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Name: ");
        this.name = input.nextLine();
        System.out.println("Input age: ");
        this.age = input.nextInt();
        input.nextLine();
        System.out.println("Input className: ");
        this.className = input.nextLine();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

