package ru.job4j.pojo;

public class Book {
    private String name;

    public Book (String name, Integer pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getPageCount () {
        return pageCount;
    }

    public void setPageCount (Integer pageCount) {
        this.pageCount = pageCount;
    }

    private Integer pageCount;
}
