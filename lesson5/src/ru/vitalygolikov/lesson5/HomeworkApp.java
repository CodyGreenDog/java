package ru.vitalygolikov.lesson5;

public class HomeworkApp {
    public static void main(String[] args) {

       // Создать массив из 5 сотрудников
        Person[] persArray = new Person[5];
        createDataBase(persArray);

       // С помощью цикла вывести информацию только о сотрудниках старше 40 лет
        printPersonOlder40(persArray);
    }

    static void createDataBase(Person[] persArray)
    {
        persArray[0] = new Person("Иванов Иван", "Инженер", "iviv@omail.com", "+79003456712",
                100000, 29);

        persArray[1] = new Person("Петров Петр", "Администратор", "pepe@omail.com",
                "+79005673413", 80000, 45);

        persArray[2] = new Person("Гилл Бейтс", "Программист-стажер", "gibe@omail.com",
                "+79002233223", 60000, 22);

        persArray[3] = new Person("Зуев Константин", "Охранник", "zuko@omail.com",
                "+78005553535", 50000, 55);

        persArray[4] = new Person("Сергеев Сергей", "Системный администратор", "sese@omail.com",
                "+75005557348", 100000, 47);
    }

    static void printPersonOlder40(Person[] persArray)
    {
        for(int i = 0; i < persArray.length; i++)
        {
            if( persArray[i].getAge() > 40 )
            {
                persArray[i].printInfo();
            }
        }

    }
}

