package net.texala.main;

/*
DAY :12
ASSIGNMENT NO : 04

Create a java program if superclass is not Serializable?

*/
 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NonSerializableSuperclass {
    protected String nonSerializableField;

    public NonSerializableSuperclass(String nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public String getNonSerializableField() {
        return nonSerializableField;
    }
}

class Subclass extends NonSerializableSuperclass implements Serializable {
    private static final long serialVersionUID = 1L;

    private String serializableField;

    public Subclass(String nonSerializableField, String serializableField) {
        super(nonSerializableField);
        this.serializableField = serializableField;
    }

    public String getSerializableField() {
        return serializableField;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getNonSerializableField());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        String nonSerializableField = (String) in.readObject();
        super.nonSerializableField = nonSerializableField;
    }
}

public class NonSerializableSupercExample {
    public static void main(String[] args) {

        Subclass obj = new Subclass("NonSerializableFieldValue", "SerializableFieldValue");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serializedObject.ser"))) {
            out.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("serializedObject.ser"))) {
            Subclass deserializedObj = (Subclass) in.readObject();
            System.out.println("Object deserialized successfully.");

            System.out.println("NonSerializableField: " + deserializedObj.getNonSerializableField());
            System.out.println("SerializableField: " + deserializedObj.getSerializableField());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

