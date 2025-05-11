package ru.numberTask;

import ru.numberTask.Opearations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите цифру");
        int number = in.nextInt();

        countSymbols countSymbols = new countSymbols();
        System.out.println("Количество символов в десятичной записи: " + countSymbols.count(Math.abs(number)));

        countDividers countDividers = new countDividers();
        System.out.println("Количество различных простых чисел, являющихся множителями: " + countDividers.count(Math.abs(number)));


        System.out.println("----------------------\nСтатистические данные классов:");
        System.out.println("Класс countSymbols:\nДата и время создания: " + countSymbols.CreateTime
                + ", количество запусков: " + countSymbols.countRun);
        System.out.println("Класс countDividers:\nДата и время создания: " + countDividers.CreateTime
                + ", количество запусков: " + countDividers.countRun);
    }
}