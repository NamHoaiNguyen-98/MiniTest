package Bai4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getClassName());
        student.setName("Lam");
        student.setAge(18);
        student.setClassName("C0623K1");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getClassName());
    }
}
