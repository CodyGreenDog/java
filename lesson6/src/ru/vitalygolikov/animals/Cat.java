package ru.vitalygolikov.animals;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {
    private static final float MAX_DISTANCE_RUN_CAT = 200;
    private static final float MAX_HEIGHT_JUMP_CAT = 2.f;
    private static final float MAX_DISTANCE_SWIM_CAT = 0.f;

    public Cat()
    {
        super(MAX_DISTANCE_RUN_CAT, MAX_HEIGHT_JUMP_CAT, MAX_DISTANCE_SWIM_CAT);

    }

    /*
     *  5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может
     *  быть 400 м., у другой 600 м.
     */
    public Cat(float maxDistanceRun, float maxHeightJump)
    {
        super(maxDistanceRun, maxHeightJump, MAX_DISTANCE_SWIM_CAT);
    }

    @Override
    public void swim(float distance)
    {
        System.out.println("Cat can't swim");
    }
}
