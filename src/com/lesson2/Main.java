package com.lesson2;



public class Main {
    public static void main(String[] args) {
        Person John = new Person("John", "Williams", 26, Person.Position.QA);
        Person Abraham = new Person("John", "Williams", 26, Person.Position.QA);


        if (John.hashCode() == Abraham.hashCode()) {
            System.out.println("Objects are equal by hashcode()!");
        } else {
            System.out.println("Objects are NOT equal by hashcode()!");
        }

        if (John.equals(Abraham)) {
            System.out.println("Objects are equal by equals()!");
        } else {
            System.out.println("Objects are NOT equal by equals()!");
        }
    }
}
