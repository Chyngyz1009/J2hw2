package com.company;

public   class Sequoia extends Trees implements Printable {
    private int age;
    private int weight;
    public Sequoia(int age, int weight){
        this.age=age;
        this.weight=weight;

    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
    @Override
     public String voidPrint(){
        return "age: "+ getAge()+"\nweight: "+getWeight();
    }
}

