/*

DAY : 12
ASSIGNMENT NO : 01

Serialization
Following are the steps for Serialization.
1.Create a Person class
2.Create SerializeMain.java in src
Deserialization
Following are the steps for Deserialization.
1.Create DeserializeMain.java in src

*/
package net.texala.main;

import java.io.*;

public class DeserializeMain {
	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
			Person person = (Person) ois.readObject();
			System.out.println("Deserialization completed. " + person);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}