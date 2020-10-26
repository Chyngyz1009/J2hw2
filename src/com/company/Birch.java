package com.company;

public  class  Birch extends Trees {
    private int age;
    private int height;

    public Birch(String name, int age, int height) {
        super(name);
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String voidPrint() {
        return "age: "+ getAge()+"\nheight: "+getHeight();
    }
}
