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

class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private transient Address address;  // this will not be serialized

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {  // convert object to byte stream
		out.defaultWriteObject();
		out.writeObject(address.getStreet());
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { //convert  a byte stream back into object
		in.defaultReadObject(); 
		String street = (String) in.readObject();
		address = new Address(street);
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
}
