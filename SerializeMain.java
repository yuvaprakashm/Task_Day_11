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

public class SerializeMain {
	public static void main(String[] args) {

		Person person = new Person("Yuva Prakash", 22);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			oos.writeObject(person);
			System.out.println("Serialization completed. Check person.ser file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}