/*
·DAY : 12
ASSIGNMENT NO :03

Create a java program if superclass is Serializable?

*/
package net.texala.main;   // If the superclass is serializable then subclass is automatically serializable 
class Subclass extends Superclass {

	private static final long serialVersionUID = 1L;
	private String subField;

	public Subclass(String superField, String subField) {
		super(superField);
		this.subField = subField;
	}

	public String getSubField() {
		return subField;
	}

}