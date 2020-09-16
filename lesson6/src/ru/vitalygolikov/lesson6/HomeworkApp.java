package ru.vitalygolikov.lesson6;

import ru.vitalygolikov.animals.*;

public class HomeworkApp {
    public static void main(String[] args)
    {
        Dog dog = new Dog();

        System.out.println("Dog. Valid values:");
        dog.run(150.f);
        dog.jump(0.2f);
        dog.swim(5.f);
        System.out.println();

        System.out.println("Dog. Invalid values:");
        dog.run(1000.f);
        dog.jump(2.f);
        dog.swim(50.f);
        System.out.println();

        Cat cat = new Cat();

        System.out.println("Cat. Valid values:");
        cat.run(100.f);
        cat.jump(1.5f);
        cat.swim(5.f);
        System.out.println();

        System.out.println("Cat. Invalid values:");
        cat.run(800.f);
        cat.jump(8.f);
        System.out.println();


        /*
         * 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег
         * может быть 400 м., у другой 600 м.
         */
        Dog superDog = new Dog(600.f, 1.5f, 30);

        System.out.println("Super Dog values:");
        superDog.run(500.f);
        superDog.jump(1.f);
        superDog.swim( 20.f);
        System.out.println();

        Cat superCat = new Cat(500.f, 4.f);
        System.out.println("Super Cat values:");
        superCat.run(400.f);
        superCat.jump(3.f);
        superCat.swim(30.f);
    }
}
