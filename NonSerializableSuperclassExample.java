/*
DAY :12
ASSIGNMENT NO : 04

Create a java program if superclass is not Serializable?

*/
package net.texala.main;    //superclass is not serializable so its fields are not included in the serialization process so those will be initialized to default value
 
class NonSerializableSuperclass {
    private String nonSerializableField;

    public NonSerializableSuperclass() {
         
    }

    public NonSerializableSuperclass(String nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public String getNonSerializableField() {
        return nonSerializableField;
    }

    
}