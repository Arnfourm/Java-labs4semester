package ru.vlsu;

import ru.vlsu.ispi.Calculator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        System.out.println("Число PI, вычисленное многопоточным алгоритмом: ");
        System.out.println(Calculator.calculator(1_000_000_000L, 6));
        System.out.println("Число PI, вычисленное встроенным методом: ");
        System.out.println(Math.PI);

        long endTime = System.currentTimeMillis();
        System.out.println("Время работы программы: " + (endTime - startTime) / 1000 + " секунд");
    }
}

