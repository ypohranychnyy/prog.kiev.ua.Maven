package com.company;

import java.util.Random;

/**
 * Created by sisense on 10/5/15.
 */
public class Dog {
    private String name;
    private String color;
    private int age;
    private boolean sex;

    public Dog(String name, String color, int age, boolean sex) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public Dog makelove(Dog anotherDog){
        if (this.isSex()==true && anotherDog.isSex()==true) {
            System.out.println(this.getName() + " " + anotherDog.getName() + " R fighting hard");
            return null;
        }

            if (this.isSex()==false && anotherDog.isSex()==false){
                System.out.println(this.getName() + " " + anotherDog.getName() + " R fighting");
                return null;
            }
        if (this.isSex()!=anotherDog.isSex()){
            Random rn = new Random();
            Dog myLittleDog = new Dog ("", "", 0, rn.nextBoolean());
            System.out.println("Puppy born!");
            return myLittleDog;
        }
        return null;
    }
}
