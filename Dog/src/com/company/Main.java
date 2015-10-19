package com.company;

public class Main {

    public static void main(String[] args) {
        Dog Sirko = new Dog("Sirko", "grey", 2, true);
        System.out.println("Age - "+ Sirko.getAge());
        System.out.println("Color - "+ Sirko.getColor());
        System.out.println("Name - "+ Sirko.getName());

        Dog Barsik = new Dog("Barsik", "White", 3, true);
        Dog Zhulya = new Dog("Zhulya", "black", 4, false);
        Dog Ruda = new Dog("Ruda", "red", 3, false);

        Sirko.makelove(Barsik);
        Sirko.makelove(Zhulya);
        Zhulya.makelove(Ruda);
        Dog myNewDog = Sirko.makelove(Zhulya);
        System.out.println(myNewDog.getName());
        myNewDog.setName("Puppy");
        myNewDog.setColor("black");
        System.out.println(myNewDog.getName());
        System.out.println(myNewDog.getColor());
        System.out.println(myNewDog.getAge());
        System.out.println(myNewDog.isSex());    }
}
