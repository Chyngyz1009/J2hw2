package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(createObject("1").voidPrint());
        System.out.println(createObject("2").voidPrint());
        System.out.println(createObject("3").voidPrint());
    }

    public static Printable createObject(String className) {
        Printable print = null;
        switch (className) {
            case "1":
                print = new Birch(20, 7);
                break;
            case "2":
                print = new Sequoia(150, 1000);
                break;
            case "3":
                print = new Poplar("white", 56);
                break;
        }
        return print;
    }


}
