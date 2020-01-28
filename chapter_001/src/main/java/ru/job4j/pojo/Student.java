package ru.job4j.pojo;

public class Student {
    private String name;
    private String group;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getGroup () {
        return group;
    }

    public void setGroup (String group) {
        this.group = group;
    }

    public String getEntranceData () {
        return entranceData;
    }

    public void setEntranceData (String entranceData) {
        this.entranceData = entranceData;
    }

    private String entranceData;
}
