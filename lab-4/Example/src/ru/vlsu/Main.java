package ru.vlsu;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ru.vlsu.ispi.PersonComparator;
import ru.vlsu.ispi.Person;

public class Main {
    private Person read(Scanner in) {
        String lastname = in.next();
        String firstname = in.next();
        return new Person(lastname, firstname);
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        List<Person> peopleList = new LinkedList<>();

        System.out.println("Введите количество человек:");
        int countPeople = in.nextInt();

        System.out.println("Введите имя и фамилию через пробел:");
        for (int i = 0; i < countPeople; i++) {
            System.out.print(i + 1 + ": ");
            peopleList.add(read(in));
        }

        Collections.sort(peopleList, new PersonComparator());
        for (Person personUnit : peopleList) {
            System.out.println(personUnit);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
