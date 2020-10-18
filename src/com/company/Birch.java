package com.company;

public  class  Birch extends Trees implements Printable{
    private int age;
    private int height;

    public Birch (int age, int height){
        this.age=age;
        this.height=height;

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
