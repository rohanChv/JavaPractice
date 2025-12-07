package com.example.SpringbootBasic;

import java.io.Serializable;

public class Courses implements Serializable {
    Long SerialVersionUID=1L;
    String name;
    String publisher;
    int Id;

    public Courses(String name, String publisher, int id) {
        this.name = name;
        this.publisher = publisher;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", Id=" + Id +
                '}';
    }
}
