/*
DAY : 02
ASSIGNMENT NO : 02
·What would you do if an object has a reference to other objects? For example, a
person has the reference of an address.
·Serialize an object of class person that has an address object and the address
class does not implement serializable interface.

*/
package net.texala.main;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Address address = new Address("12 Main Street");
        Person person = new Person("Yuva Prakash", address);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {   // convert object to byte stream
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {   // convert  a byte stream back into object
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Address: " + deserializedPerson.getAddress().getStreet());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}