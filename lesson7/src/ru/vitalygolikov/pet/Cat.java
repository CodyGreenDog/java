package ru.vitalygolikov.pet;

public class Cat {
    private String name;
    private int appetite;

    /*
     * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
     * Если коту удалось покушать (хватило еды), сытость = true
     */
    private boolean isFull;

    public Cat(String name, int appetite)
    {
        isFull = false;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p)
    {
        //see into a plate
        boolean isEnaughFood = isEnoughFood(p);

        if(isEnaughFood)
        {
            p.decreaseFood(appetite);
            isFull = true;
        }
    }

    /*
     * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
     * то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
     */
    private boolean isEnoughFood(Plate p)
    {
        return p.getFood() >= appetite;
    }
}
