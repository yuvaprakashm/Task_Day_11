/*
DAY : 02
ASSIGNMENT NO : 02
·What would you do if an object has a reference to other objects? For example, a
person has the reference of an address.
·Serialize an object of class person that has an address object and the address
class does not implement serializable interface.

*/
package net.texala.main;

class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}

