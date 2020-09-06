package ru.vitalygolikov.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeworkApp {
    private final static int MAX_WORD_LENGTH = 15;
    private static char[] tmpArr = new char[MAX_WORD_LENGTH];
    public static void main(String[] args)
    {

        boolean isGameContinue;
        //Главный цикл
        do
        {

            isGameContinue = mainCycle();

        }while(isGameContinue);
    }

    //===============================
    //Главный экран выбора игры
    //===============================
    static boolean mainCycle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, чтобы выбрать игру:\n" +
                "1 - Игра \"Угадай число\"\n2 - Игра \"Угадай слово\"");
        int gameNumber = scanner.nextInt();


        switch(gameNumber) {

            case 1:
                /* 1. Написать программу, которая загадывает случайное число от 0 до 9,
                   и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
                   должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
                   После победы или проигрыша выводится запрос – «Повторить игру еще раз?
                   1 – да / 0 – нет»(1 – повторить, 0 – нет).
                 */

                guessTheNumber();
                break;

            case 2:
                /*
                  Задание 2: Угадать слово (из заранее заданного массива слов).
                  При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
                  сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
                  Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
                  apple – загаданное
                  apricot - ответ игрока
                  ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
                  Играем до тех пор, пока игрок не отгадает слово
                  Используем только маленькие буквы
                */
                String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
                int size = words.length;
                Random random = new Random();
                int numWord = random.nextInt(size);
                guessTheWord( words[numWord] );
                break;

            default:
                System.out.println("Введено некорректное число");
                break;
        }
        System.out.println("Вернуться к выбору игры?\n1 - да;\n0 - нет.");
        return scanner.nextInt() == 1 ? true : false;
    }

    //игры
    //=================================================================================================================

    //Игра "угадай число"
    //---------------------------------------------------------------------------------------------
    static void guessTheNumber()
    {
        final int BOUND = 10;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean repeatGame;
        do
        {
            int number = random.nextInt( BOUND );
            System.out.println("Загадано число от 0 до 9. Попытайтесь его отгадать.\n");

            boolean flagNumberGuessed = isNumberGuessed( number );

            String result = flagNumberGuessed ? " угадано: Вы выиграли!\n" : " не угадано: Вы проиграли\n";
            System.out.println("Число " + number + result);
            System.out.println("Повторить игру?\nВведите:\n1 - да;\n0 - нет");

            repeatGame = scanner.nextInt() == 1 ? true : false;

        } while(repeatGame);
    }

    static boolean isNumberGuessed( int requiredNumber )
    {
        final int NUM_CONTINUE = 3;

        Scanner scanner = new Scanner( System.in );
        boolean flagNumberGuessed = false;
        int numContinue = NUM_CONTINUE;

        do
        {
            System.out.print("У Вас " + numContinue + " попытки\n" + "Введите число от 0 до 9: ");
            int inputNumber = scanner.nextInt();
            flagNumberGuessed = inputNumber == requiredNumber;

            String equalSign = inputNumber > requiredNumber ? "больше" : "меньше";
            if(!flagNumberGuessed)
            {
                System.out.println("Вы не угадали, ваше число " + equalSign + ", чем загаданное\n");
            }

            numContinue--;
        } while ( numContinue > 0 && !flagNumberGuessed );

        return flagNumberGuessed;
    }
    //------------------------------------------------------------------------------------------------------------

    //Игра "Угадай слово"
    //---------------------------------------------------------

    static void guessTheWord(String word)
    {

        fillArrayWithSymbol(tmpArr, '#', MAX_WORD_LENGTH);
        boolean flagWordGuessed;
        System.out.println("Угадайте слово");


        System.out.println();

        do
        {
             flagWordGuessed = isWordGuessed(word);
             if(!flagWordGuessed)
             {
                 System.out.println("Продолжайте угадывать");
             }

        }while(!flagWordGuessed);

        System.out.println("Вы угадали! Слово: \"" + word + "\".");
    }

    static boolean isWordGuessed(String reqWord)
    {
        Scanner scanner = new Scanner(System.in);
        String inWord = scanner.nextLine();
        printWordCompareResult(reqWord, inWord);

        return reqWord.equals(inWord);
    }

    static void printWordCompareResult(String reqWord, String inWord)
    {


        int reqSize = reqWord.length();
        int inSize = inWord.length();
        int size = Math.min(reqSize, inSize);

        for(int i = 0; i < size; i++)
        {
            if(inWord.charAt(i) == reqWord.charAt(i))
            {
                tmpArr[i] = reqWord.charAt(i);
            }

            System.out.print(tmpArr[i]);
        }

        for(int i = size; i < MAX_WORD_LENGTH; i++)
        {
            System.out.print(tmpArr[i]);
        }
        System.out.println();
    }

    static void fillArrayWithSymbol(char[] arr, char symbol, int size)
    {
        for(int i = 0; i < size; i++)
        {
            arr[i] = symbol;
        }
    }
    //---------------------------------------------------------

}
