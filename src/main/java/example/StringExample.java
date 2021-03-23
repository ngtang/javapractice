package main.java.example;

public class StringExample {

	// Concatenates to String
	public static void concatString(String s1) {
		s1 = s1 + "copied from some where";
	}

	// Concatenates to StringBuilder
	public static void concatStringBuilder(StringBuilder s2) {
		s2.append("copied from some where");
	}

	public static void main(String[] args) {
		String s1 = "Nox ";

		// s1 is not changed
		concatString(s1);
		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("Nox ");

		// s2 is changed
		concatStringBuilder(s2);
		System.out.println("StringBuilder: " + s2);
	}
}