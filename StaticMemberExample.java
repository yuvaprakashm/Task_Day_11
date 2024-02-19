/*
DAY :12
ASSIGNMENT NO : 06

Create a java program if class members are static.

*/
package net.texala.main;

class StaticMembers {
	static int staticField = 10;

	void staticMethod() {
		System.out.println(staticField);
		System.out.println("Static method called.");
	}
}

public class StaticMemberExample {
	public static void main(String[] args) {
		System.out.println("Static field: " + StaticMembers.staticField);
		StaticMembers s1 = new StaticMembers();
		s1.staticMethod();
		// StaticMembers.staticMethod();
	}
}
