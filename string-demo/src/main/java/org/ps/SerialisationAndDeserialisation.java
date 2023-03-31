package org.ps;
import java.io.*;


public class SerialisationAndDeserialisation {
    public static void main(String[] args) {
        // Create an object to serialize
        Employee emp = new Employee("John Doe", "Software Developer", 50000.0);

        try {
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize the object
        Employee empDeserialized = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            empDeserialized = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        // Print the deserialized object
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + empDeserialized.name);
        System.out.println("Position: " + empDeserialized.position);
        System.out.println("Salary: " + empDeserialized.salary);
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 1000000000000L;
    public String name;
    public String position;
    public double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

class ExternalizableDemo {
    public static void main(String[] args) {
        // Create an object to serialize
        Employee2 emp2 = new Employee2("John Doe", "Software Developer", 50000.0);

        try {
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("employee2.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp2);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialize the object
        Employee2 empDeserialized2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee2.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            empDeserialized2 = (Employee2) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        // Print the deserialized object
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + empDeserialized2.name);
        System.out.println("Position: " + empDeserialized2.position);
        System.out.println("Salary: " + empDeserialized2.salary);
    }
}

class Employee2 implements Externalizable {
    public String name;
    public String position;
    public double salary;

    public Employee2() {} // Required no-argument constructor for Externalizable

    public Employee2(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Implement serialization
        out.writeObject(name);
        out.writeObject(position);
        out.writeDouble(salary);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Implement deserialization
        name = (String) in.readObject();
        position = (String) in.readObject();
        salary = in.readDouble();
    }
}