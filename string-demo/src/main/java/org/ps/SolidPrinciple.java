package org.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SolidPrinciple {
}

//    The SOLID principles are a set of five design principles that help developers create more maintainable and scalable software. These principles are:
//
//        1. Single Responsibility Principle (SRP)
//        2. Open/Closed Principle (OCP)
//        3. Liskov Substitution Principle (LSP)
//        4. Interface Segregation Principle (ISP)
//        5. Dependency Inversion Principle (DIP)
//
//        Here is an example of how to implement these principles in Java:
//
//        1. Single Responsibility Principle (SRP)
//
//        The SRP states that a class should have only one reason to change. This means that a class should have only one responsibility.
//
//        Example:

class EmailSender {
    public void sendEmail(String to, String subject, String body) {
        // Code to send email
    }
}

//In this example, the EmailSender class has only one responsibility, which is to send emails. If there is a need to change the way emails are sent, we only need to modify this class.
//
//        2. Open/Closed Principle (OCP)
//
//        The OCP states that a class should be open for extension but closed for modification. This means that we should be able to add new functionality to a class without modifying its existing code.
//
//        Example:

interface Operation{
   public void func(int x, int y);
}
class AdditionOperation implements Operation {
    @Override
    public void func(int x, int y) {
        int sum = x + y;
        System.out.println("Addition : " + sum);
    }
}
class SubstractionOperation implements Operation {
    @Override
    public void func(int x, int y) {
        int sub = x - y;
        System.out.println("Substraction : " + sub);
    }
}

class Calculator{
    List<Operation> operations;

    public Calculator() {
        this.operations = new ArrayList<>();
    }

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public static void main(String[] args) {
        List<Operation> listOfOperation = new ArrayList<>();
        listOfOperation.add(new AdditionOperation());
        listOfOperation.add(new SubstractionOperation());
        Calculator calculator = new Calculator(listOfOperation);
        calculator.operations.stream().filter(operation -> operation.getClass() == AdditionOperation.class).collect(Collectors.toList()).get(0).func(1, 2);
        calculator.operations.stream().filter(operation -> operation.getClass() == SubstractionOperation.class).collect(Collectors.toList()).get(0).func(1, 2);
    }
}




//In this example, if we need to add new operation we can implement Operation interface and add to list of Operations and perform the operation without modification of the code.
//        3. Liskov Substitution Principle (LSP)
//
//        The LSP states that a subclass should be able to replace its parent class without affecting the correctness of the program. This means that a subclass should behave like its parent class.
//
//        Example:

class Animal {
    public void eat() {
        // Code to eat
    }
}

class Dog extends Animal {
    public void bark() {
        // Code to bark
    }
}

class Cat extends Animal {
    public void meow() {
        // Code to meow
    }
}

//In this example, the Dog and Cat classes are subclasses of the Animal class. They behave like their parent class, as they both have an eat() method. However, they also have their own unique behavior, such as bark() and meow().
//
//        4. Interface Segregation Principle (ISP)
//
//        The ISP states that a class should not be forced to implement interfaces it does not use. This means that we should break down interfaces into smaller, more specific interfaces.
//
//        Example:

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        // Code to print
    }

    public void scan() {
        // Code to scan
    }
}

class SimplePrinter implements Printer {
    public void print() {
        // Code to print
    }
}

//In this example, we have broken down the Printer and Scanner interfaces into smaller, more specific interfaces. The MultiFunctionPrinter class implements both interfaces, as it has both printing and scanning capabilities. The SimplePrinter class only implements the Printer interface, as it only has printing capabilities.
//
//        5. Dependency Inversion Principle (DIP)
//
//        The DIP states that high-level modules should not depend on low-level modules. Instead, both should depend on abstractions. This means that we should use interfaces to decouple our code.
//
//        Example:

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        // Code to save data to MySQL database
    }
}

class OracleDatabase implements Database {
    public void save(String data) {
        // Code to save data to Oracle database
    }
}

class DataService {
    private Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}

//In this example, the DataService class depends on the Database interface, not on the MySQLDatabase or OracleDatabase classes. This allows us to easily switch between different database implementations without modifying the DataService class.
