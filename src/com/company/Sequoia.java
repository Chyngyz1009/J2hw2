package com.company;

public class Sequoia extends Trees {
    private int age;
    private int weight;

    public Sequoia(String name, int age, int weight) {
        super(name);
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String voidPrint() {
        return super.voidPrint() + "age: " + getAge() + "\nweight: " + getWeight();
    }
}

