package ru.vitalygolikov.animals;

public abstract class Animal {
    private final float MAX_DISTANCE_RUN;
    private final float MAX_HEIGHT_JUMP;
    private final float MAX_DISTANCE_SWIM;

    /*
     *  5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может
     *  быть 400 м., у другой 600 м.
     */
    public Animal(float maxDistanceRun, float maxHeightJump, float maxDistanceSwim)
    {
        MAX_DISTANCE_RUN = maxDistanceRun;
        MAX_HEIGHT_JUMP = maxHeightJump;
        MAX_DISTANCE_SWIM = maxDistanceSwim;
    }

    /*
     *  2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра
     *  каждому методу передается величина, означающая или длину препятствия
     *  (для бега и плавания), или высоту (для прыжков)
     *
     *  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
     *  собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
     *
     *  4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
     * (Например, dog1.run(150); -> результат: run: true)
     */


    public void run(float distance)
    {
        System.out.println("run: " + isDistanceRunValid(distance));
    }

    public void swim(float distance)
    {
        System.out.println( "swim: " + isDistanceSwimValid(distance) );
    }
    public void jump(float height)
    {
        System.out.println( "jump: " + isHeightJumpValid(height) );
    }


    //=================================================================================
    // Check Utills
    //=================================================================================
    private boolean isDistanceRunValid(float distance)
    {
        return distance <= MAX_DISTANCE_RUN && distance >= 0.f;
    }

    private boolean isHeightJumpValid(float height)
    {
        return height <= MAX_HEIGHT_JUMP && height >= 0.f;
    }

    private boolean isDistanceSwimValid(float distance)
    {
        return distance <= MAX_DISTANCE_SWIM && distance >= 0.f;
    }
}
