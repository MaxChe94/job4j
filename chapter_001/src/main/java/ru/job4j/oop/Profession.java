package ru.job4j.oop;

public class Profession {
    String name;
    String surname;
    String education;
    String birthday;

    public String getName(){
        return this.name;
    }

    public String getSurame(){
        return this.surname;
    }

    public String getEducation(){
        return this.education;
    }

    public String getBirthday(){
        return this.birthday;
    }

    public class Doctor extends Profession {
        String experience;
        String category;
        public Diagnos heal(Patient patient){

        }

    }

    public class Engineer extends Profession {
        String specialization;
        String category;
        public Project makeProject(Customer customer){

        }
    }

    public class Surgeon extends Doctor{
        int surgeryCount;
        public void doSurgery(Patient patient) {

        }
    }

    public class Dentist extends Doctor{
        String clinicName;
        public void removeTooth(Patient patient) {

        }
        public void putSeal(Patient patient){

        }
    }

    public class Programmer extends Engineer{
        boolean freelancer;
        String language;
        public void drinkCofee(){

        }
        public void makeCode(){

        }
    }

    public class Builder extends Engineer{
        String companyName;
        public void pourFoundation(){

        }
        public void installWindows(){

        }
    }

    public class Customer{
        String name;
        String task;
        double busget;
    }

    public class Project{
        String name;
        String description;
        double price;
    }

    public class Patient{
        String name;
        Diagnos diagnos;
        String condition;
    }

    public class Diagnos{
        int code;
        int description;
    }

}
