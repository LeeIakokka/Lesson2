package com.lesson2;


public class Person {

    protected enum Position { DIRECTOR, DEVELOPER, QA }

    final private String name;
    final private String lastName;
    final private int age;
    final private Position position;


    public Person(String name, String lastName, int age, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        if (!lastName.equals(person.lastName)) return false;
        return position == person.position;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + position.hashCode();
        return result;
    }
}
