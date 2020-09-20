package ru.vitalygolikov.pet;

public class Plate {
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("plate: " + food);
    }

    public int getFood()
    {
        return food;
    }

    public  void decreaseFood(int n)
    {
        food = saturateValue(n);
    }

    /*
     * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
     */
    public void addFood(int n)
    {
        food += n;
    }


    /*
     * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
     * (например, в миске 10 еды, а кот пытается покушать 15-20)
     */
    private int saturateValue(int n)
    {
        int result = food - n;
        return  result > 0 ? result : 0;
    }

}
