package com.company;

public  class Poplar extends Trees implements Printable {
    private String color;
    private int height;

    public Poplar(String color,int height){
        this.color=color;
        this.height=height;


    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String voidPrint() {
        return "color: "+ getColor()+"\nheight: "+getHeight();
    }
}
