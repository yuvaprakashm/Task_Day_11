/*
·DAY : 12
ASSIGNMENT NO :03

Create a java program if superclass is Serializable?

*/
package net.texala.main;

import java.io.*;

class Superclass implements Serializable {
	private static final long serialVersionUID = 1L;

	private String superField;

	public Superclass(String superField) {
		this.superField = superField;
	}

	public String getSuperField() {
		return superField;
	}

}