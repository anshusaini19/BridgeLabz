import java.util.*;

// Generic class
class DataStore<T> {

    // List to store data of any type
    private List<T> list = new ArrayList<>();

    // Add item
    public void add(T item) {
        list.add(item);
    }

    // Remove item
    public void remove(T item) {
        list.remove(item);
    }

    // Check if item exists
    public boolean contains(T item) {
        return list.contains(item);
    }

    // Return all items
    public List<T> getAll() {
        return list;
    }
}

// Employee class
class Employee {

    int id;
    String name;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() for meaningful output
    @Override
    public String toString() {
        return id + " " + name;
    }
}

// Main class
public class GenericDemo {

    public static void main(String[] args) {

        // =========================
        // Integer Example
        // =========================
        DataStore<Integer> numbers = new DataStore<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers.getAll());

        System.out.println("Contains 20? " + numbers.contains(20));

        numbers.remove(20);

        System.out.println("After removing 20: " + numbers.getAll());

        // =========================
        // String Example
        // =========================
        DataStore<String> names = new DataStore<>();

        names.add("Anshu");
        names.add("Rahul");

        System.out.println("Names: " + names.getAll());

        // =========================
        // Employee Example
        // =========================
        DataStore<Employee> employees = new DataStore<>();

        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "David"));

        System.out.println("Employees: " + employees.getAll());
    }
}