package ru.vlsu.ispi;

public class Person {
    private final String lastname;
    private final String firstname;

    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() { return lastname; }
    public String getFirstname() { return firstname; }

    public String toString() { return lastname + " " + firstname; }
}