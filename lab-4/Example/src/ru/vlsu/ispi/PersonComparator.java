package ru.vlsu.ispi;

import java.util.Comparator;

public class PersonComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        int res = p1.getLastname().compareTo(p2.getLastname());
        if (res != 0){
            return res;
        }
        return p1.getFirstname().compareTo(p2.getFirstname());
    }
}