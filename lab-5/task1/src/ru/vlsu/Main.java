package ru.vlsu;

import ru.vlsu.ispi.Calculator;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println("Число PI, вычисленное написанным алгоритмом: ");
        System.out.println(Calculator.calculator(Integer.MAX_VALUE));
        System.out.println("Число PI, вычисленное встроенным методом: ");
        System.out.println(Math.PI);

        long endTime = System.currentTimeMillis();
        System.out.println("Время работы программы: " + (endTime - startTime) / 1000 + " секунд");
    }
}

