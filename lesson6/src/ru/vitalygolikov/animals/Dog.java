package ru.vitalygolikov.animals;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {
    private static final float MAX_DISTANCE_RUN_DOG = 500.f;
    private static final float MAX_HEIGHT_JUMP_DOG = 0.5f;
    private static final float MAX_DISTANCE_SWIM_DOG = 10.f;

    public Dog()
    {
        super(MAX_DISTANCE_RUN_DOG, MAX_HEIGHT_JUMP_DOG, MAX_DISTANCE_SWIM_DOG);
    }

    /*
     *  5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может
     *  быть 400 м., у другой 600 м.
     */
    public Dog(float maxDistanceRun, float maxHeightJump, float maxDistanceSwim)
    {
        super(maxDistanceRun, maxHeightJump, maxDistanceSwim);
    }

}
