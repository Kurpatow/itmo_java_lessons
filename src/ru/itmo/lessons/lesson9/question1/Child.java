package ru.itmo.lessons.lesson9.question1;

import static ru.itmo.lessons.lesson9.question1.Parent.random;

public class Child {

    public static void childStaticVoid1(){
        // какие методы родителя можно вызвать?
        random(10, 77);
    }

    public void childVoid1(){
        // какие методы родителя можно вызвать? как это сделать?
        //super.void1();
        //super.void3();
        //super.void4();
        random(12, 70);
    }

    // какие методы можно переопределить?
    // void1, void4
    // private метод переопределить нельзя
    // static метод переопределить нельзя

    /* что лишнее? */
    public /* final */ static void childStaticVoid2(){
        System.out.println("Статический метод");
    }
}
