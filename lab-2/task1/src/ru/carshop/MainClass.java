package ru.carshop;

import ru.carshop.impl.MyOwnAutoShop;
import ru.carshop.cars.Car;

import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        MyOwnAutoShop newOne = new MyOwnAutoShop();

        while (true){
            System.out.println("-----------------------------");
            System.out.println("Выберите команду:\n1 - Напечатать цены всех авто\n2 - Напечатать цвета всех авто\n" +
                    "3 - Напечатать цену авто под id\n4 - Напечатать цвет авто под id\n5 - Выбрать авто для покупки\n" +
                    "6 - Узнать сумму всех покупок за сегодня\n7 - Завершить программу");
            int choice = in.nextInt();
            System.out.println();

            if (choice == 1){
                double[] priceList = newOne.getCarsPrice();
                for(int i = 0; i < priceList.length; i++){
                    System.out.println("Цена авто под Id - " + i + ": " + priceList[i]);
                }
            }
            else if(choice == 2){
                String[] colorList = newOne.getCarsColors();
                for(int i = 0; i < colorList.length; i++){
                    System.out.println("Цвет авто под Id - " + i + ": " + colorList[i]);
                }
            }
            else if(choice == 3){
                System.out.println("Введите нужное айди");
                int choiceID = in.nextInt();
                System.out.println("Цена авто под Id - " + choiceID + ": " + newOne.getCarPrice(choiceID));
            }
            else if(choice == 4){
                System.out.println("Введите нужное айди");
                int choiceID = in.nextInt();
                System.out.println("Цвет авто под Id - " + choiceID + ": " + newOne.getCarColor(choiceID));
            }
            else if(choice == 5){
                System.out.println("Введите нужное айди");
                int choiceID = in.nextInt();
                System.out.println("Поздравляю! Вы купили машину под Id - " + choiceID + " и имеющую следующие "
                        + "характеристики: цена со скидкой - " + newOne.getCarPrice(choiceID) + ", "
                        + newOne.purchaseCar(choiceID).giveInfoCar());
            }
            else if(choice == 6){
                System.out.println("Сумма всех купленных за сессию авто: " + newOne.getIncome());
            }
            else if(choice == 7){
                break;
            }
        }
    }
}