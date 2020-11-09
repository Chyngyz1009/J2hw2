package com.company;

public class Trees implements Printable{
    public String name;

    public Trees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String voidPrint() {
        return "name"+ name;
    }
}
