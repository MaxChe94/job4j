package ru.job4j.pojo;

public class College {
    public static void main (String[] args) {
        Student student = new Student();
        student.setName("Иванов Иван Иваныч");
        student.setGroup("H11");
        student.setEntranceData("01.09.2019");
        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getEntranceData());
    }
}
