package ru.vitalygolikov.lesson7;

import ru.vitalygolikov.pet.*;

public class HomeworkApp {
    static final int CATS_COUNT = 5;
    public static void main(String[] args)
    {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();

        /*
         * 1. Расширить задачу про котов и тарелки с едой
         *
         * 5. Создать массив котов и тарелку с едой, попросить всех котов
         * покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
         */

        Cat cats[] = new Cat[CATS_COUNT];
        initCatsArray(cats);

        Plate commonPlate = new Plate(100);

        System.out.println("Feed the cats:");
        commonPlate.info();

        feedCats(cats, commonPlate);

    }


    private static void initCatsArray(Cat[] cats)
    {
        cats[0] = new Cat("Murzik", 150);
        cats[1] = new Cat("Gosha", 20);
        cats[2] = new Cat("Musya", 50);
        cats[3] = new Cat("Varya", 8);
        cats[4] = new Cat("Chernish", 35);
    }

    private static void feedCats(Cat[] cats, Plate plate)
    {
        for(int i = 0; i < cats.length; i++)
        {
            System.out.println("\nFeed a cat # " + i);
            cats[i].eat(plate);
            plate.info();
        }
    }
}
