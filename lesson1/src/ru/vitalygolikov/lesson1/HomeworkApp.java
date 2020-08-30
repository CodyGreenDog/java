package ru.vitalygolikov.lesson1;

public class HomeworkApp {
    public static void main(String args[])
    {
        /*
        * Задание 2:
        * Cоздать и инициализировать переменные каждого из 8 примитивных типов
        */

        byte bVar = 12;
        short sVar = 500;
        int iVar = 100000;
        long lVar = 512l;

        float fVar = 1.5f;
        double dVar = 8.53;

        char cVar = 's';
        boolean blVar = true;


        /*
        * Задание 3
        * Вычисление выражения
        */
        float a = 1.23f;
        float b = 5.67f;
        float c = 45.f;
        float d = 437.78f;

        float calculationsResult = performCalculations( a, b, c, d);
        System.out.println("Результат задания № 3 равен " + calculationsResult);

        /*
        * Задание 4
        * Метод возвращает true, если число лежит в интервале [10, 20],
        * иначе false
        */
        float number1 = 8.5f;
        float number2 = 5.6f;

        boolean flagInside = isInsideTheInterval( number1, number2 );
        System.out.println("Результат выполнения задания №4 равен " + flagInside);

        /*
        * Задание 5
        * Печатает, положительное или отрицательное число передано в качестве аргумента
        */
        int number = -8;
        System.out.print("Результат выполнения задания №5: ");
        printNumberSign(number);

        /*
        * Задание 6
        * Если в метод передано положительное число, возвращается true, иначе false
        */
        number = 7;
        boolean flagPositive = isPositive(number);
        System.out.println("Результат выполнения задания № 6 равен " + flagPositive);

        /*
        * Задание 7
        * Метод принимает строку и выводит сообщение "Привет, [аргумент]"
        */
        greetAnyone("Антон");
        greetAnyone("Юзер");

        /*
        * Задание 8
        * Метод определяет и печатает в консоль, является ли год високосным
        */

        isLeapYear(345);
        isLeapYear(2357);
        isLeapYear(160000);
        isLeapYear(3000);
    }

    //Задание 3
    static float performCalculations(float a, float b, float c, float d)
    {
        return a * ( b + (c/d) );
    }

    //Задание 4
    static boolean isInsideTheInterval(float number1, float number2)
    {
        boolean result = false;
        float sum = number1 + number2;
        if( sum >= 10.f )
        {
            if( sum <= 20.f)
            {
                result = true;
            }
        }
        return result;
    }

    //Задание 5
    static void printNumberSign( int number )
    {
        String sign = number >= 0 ? " положительное" : " отрицательное";
        System.out.println("Число " + number + sign);
    }

    //Задание 6
    static boolean isPositive(int number)
    {
        boolean result;

        if(number >= 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    //Задание 7
    static void greetAnyone(String name)
    {
        System.out.println("Привет, " + name);
    }

    //Задание 8
    static void isLeapYear(int year)
    {
        boolean isLeap;
        if( year % 4 == 0 )
        {
            isLeap = true;

            if(year % 100 == 0)
            {
                if( year % 400 != 0)
                {
                    isLeap = false;
                }
            }

        }
        else
        {
            isLeap = false;
        }

        if(isLeap)
        {
            System.out.println("Год " + year + " високосный");
        }
        else
        {
            System.out.println("Год " + year + " не високосный");
        }

    }
}
