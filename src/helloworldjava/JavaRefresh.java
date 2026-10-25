package helloworldjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaRefresh extends Maths {
	public void checkDrivingStatus() {
		short yourAge, license;
		yourAge = license = 0;
		String statement = ("Enter your age: ");
		Scanner s = new Scanner(System.in);
		System.out.println(statement);
		yourAge = Short.parseShort(s.nextLine());
		if (yourAge >= 18) {
			statement = ("Do you have a LiCENSE?: ");
			System.out.println(statement);
			license = Short.parseShort(s.nextLine());
			if (license > 0) {
				statement = "You can DRIVE!";
			} else {
				statement = "Get DRIVING LIcense first!";
			}
		} else {
			statement = "Go with the DRIVER! kid";
		}
		s.close();
		System.out.println(statement);
	}

	public void dataTypesJava() {

//		Java Primitive Variables:

		System.out.println("Java Primitive Variables");

		byte b = 28;
		short s = 28;
		long l = 28L;
		int i = 28;
		float f = 28.00f;
		double d = 28D;
		char c = 'P';
		boolean bool = true;

		System.out.println("Byte Value: " + (b) + ".");
		System.out.println("Short Value: " + (s) + ".");
		System.out.println("Long Value: " + (l) + ".");
		System.out.println("Int Value: " + (i) + ".");
		System.out.println("Float Value: " + (f) + ".");
		System.out.println("Double Value: " + (d) + ".");
		System.out.println("Char Value: " + (c) + ".");
		System.out.println("Boolean Value: " + (bool) + ".");

		System.out.println("Java NoN-Primitive Variables");

		String str = "PAKISTAN";
		byte counting[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println("Sting s: " + str);
		System.out.println("INT Array:");
		for (b = 0; b < counting.length; b++) {
			System.out.format("%d%n", counting[b]);
		}
	}

	public void hashSetExample() {
		HashSet<String> myCars = new HashSet<>();
		myCars.add("Suzuki FX");
		myCars.add("Honda Civic");
		myCars.add("Toyota Land Crusier");
		myCars.add("Suzuki Alto");
		myCars.add("Suzuki FX");
		myCars.add("Suzuki Alto");
		System.out.format("%d%n", myCars.size());
		System.out.format("%s%n", myCars);
		boolean check = myCars.contains("Suzuki Alto");
		System.out.println(check);
		myCars.remove("Suzuki FX");
		System.out.println(myCars);
		System.out.format("%s%n", myCars.size());
		System.out.format("%.2f%n", Float.parseFloat(String.valueOf(myCars.size())));
		for (String s : myCars) {
			System.out.format("%s%n", s);
		}
		myCars.clear();
		System.out.format("%s%n", myCars);
	}

	public void JavaArray() {
		byte target, i;
		byte[] score = { 85, 92, 78, 99, 64 };
		target = 99;
		i = 0;
		for (i = 0; i <= (score.length - 1); i++) {
			if (score[i] == target) {
				System.out.println(target + " is at position: " + i);
				continue;
			}
		}
		char[] myCountry = new char[8];
		myCountry[0] = 'P';
		myCountry[1] = 'A';
		myCountry[2] = 'K';
		myCountry[3] = 'I';
		myCountry[4] = 'S';
		myCountry[5] = 'T';
		myCountry[6] = 'A';
		myCountry[7] = 'N';
		System.out.print(myCountry);
	}

	public void javaDatesAndTime() {
//		Java Dates and Time Library.
		Date dT = new Date();
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("Today's Date: " + dT.toString());
		System.out.println("Java Calander: " + cal.getTimeZone().getID().toString());
	}

	public void JavaException() throws ArrayIndexOutOfBoundsException {
		System.out.println("JavaRefresh.JavaException()");
		try {
			byte[] counting = new byte[10];
			System.out.format("%d", counting);
			throw new ArrayIndexOutOfBoundsException("INDEX NOT FOUND");
		} catch (Exception e) {
			System.out.println("Errr: " + e.toString());
		}
	}

	public void JavaLoops() {
		Functions fun = new Functions();
		byte counter = 0;
		byte counting[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		byte leng = Byte.parseByte(String.valueOf(counting.length));

//		For Loop Example
		fun.display("For Loop Example");
		for (counter = 0; counter < leng; counter++) {
			fun.display(counting[counter]);
		}

//		while loop example
		fun.display("While Loop Example");
		counter = Byte.parseByte(String.valueOf(leng - 1));
		while (counter >= 0) {
			fun.display(counting[counter]);
			counter--;
		}

//		DO-While Loop Example
		fun.display("DO-While Loop Example");
		counter = 0;
		do {
			fun.display(counting[counter]);
			counter++;
		} while (counter <= leng - 1);

//	For-in Loop Example
		fun.display("For-in Loop Example");
		for (Byte b : counting) {
			fun.display(b);
		}
	}

	public void javaOperators() {
//		Ternary Operator
		short age = 16, check;
		check = (age < 18) ? age++ : age--;
		System.out.println(check + ", " + age);
//		instance of Operator
		System.out.format("%s", ("Wellcome" instanceof String));

	}

	public void JavaString() throws MyException {

		String myCountry = "PAKISTAN";
		String country = "Pakistan";
		String myCity = new String("Karachi");
		String city = new String("KARACHI");

		System.out.println(myCountry.toLowerCase() == country.toLowerCase()); // returns (false) because (Primitive
																				// DataType).
		System.out.println(country.toLowerCase().equals(myCountry.toLowerCase())); // returns (true) because (Object
																					// Comparison).

		System.out.println(myCity.toLowerCase() == city.toLowerCase()); // returns (false) because two Objects cannot
																		// have same address.
		System.out.println(myCity.toLowerCase().equals(city.toLowerCase())); // returns (true) because Two Different
																				// Objects have Same Text.
		throw new MyException(myCity + " " + myCountry);
	}

	public void javaSwitch() {
		String[] drinks = { "Coffee", "Chai", "Cold Drink" };
		Functions fun = new Functions();
		fun.display("What would like to have?");
		fun.display("1: Chai, 2: Cold Drink, 3: Coffee");
		byte option = 0;
		String statement = "";
		switch (option) {
		case 1: {
			statement = "Here is your " + drinks[option];
			break;
		}
		case 2: {
			statement = "Here is your " + drinks[option];
		}
		case 3: {
			statement = "Here is your " + drinks[option];
		}
		default:
			throw new IllegalArgumentException("Woooo, We didn't SERVE THAT!" + option);
		}
		fun.display(statement);
	}

	public void linkedHashSetExample() {
		LinkedHashSet<Integer> mySet = new LinkedHashSet<>();
		int counting[] = new int[10];
		for (int i = 0; i <= (counting.length - 1); i++) {
			counting[i] = i;
			for (int j = 0; j <= (i); j++) {
				mySet.add(counting[j]);
			}
		}
		System.out.format("%s%n", mySet);
		mySet.remove(counting[0]);
		System.out.format("%s%n", mySet);
		boolean check = mySet.contains(counting[6]);
		System.out.format("%s:%d%n", check, counting[6]);
		for (Integer k : mySet) {
			System.out.format("%s%n", k);
		}
		int getSize = mySet.size();
		System.out.format("%s%d%n", "Size: ", getSize);
		mySet.clear();
		System.out.format("%s%n", mySet);
	}

	public void nonPrimitiveTypes() {
		// Non Primitives DataTypes are programmer defined, except String and Array
		// DataTypes.
		String textStatement = "I Love Java Programming Language.";
		short counting[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		char myCountry[] = { 'P', 'A', 'K', 'I', 'S', 'T', 'A', 'N' };
		short i = 0;
		for (i = 0; i < counting.length; i++) {
			System.out.println(counting[i]);
		}
		i = 0;
		while (i < myCountry.length) {
			System.out.println(myCountry[i]);
			i++;
		}
		i = 0;
		do {
			System.out.println(i + ":" + textStatement);
			i++;
		} while (i < textStatement.length());
	}

	public void primitiveTypes() {
//		There are Eight (08) Premitive Dataypes in Java.
		byte age = 127; // (08) Bits called 1 Byte
		System.out.println("Byte Age: " + age + ".");
		short score = 32767; // (02) Bytes: 16 Bits
		System.out.println("Short Score: " + score + ".");
		int salary = 2100000000; // (04) Bytes: 32 Bits.
		System.out.println("Integer Salary: " + salary + ".");
		long distance = 2100000000l; // (08) Bytes: 64 Bits.
		System.out.println("Long Distance: " + distance + ".");
		float PI = 3.14f; // (04) Bytes: 32 Bits. SIngle Precision Fractional.
		System.out.println("Float PI: " + PI + ".");
		double price = 44.33; // (08) Bytes: 64 Bits. Double Precision Fractional.
		System.out.println("Double Price: " + price + ".");
		boolean weekend = true; // (01) Bit. Only (True or False).
		System.out.println("Boolean Weekend: " + weekend + ".");
		char letter = 'P'; // (02) Bytes: 16 Bits, Unicode Characters, SIngle Quoted.
		System.out.println("Char Letter: " + letter + ".");
	}

	public void stringExample() {

		String word1 = "Java";
		String word2 = new String("Java");

		// Comparison A
		if (word1 == word2) {
			System.out.println("A is True");
		} else {
			System.out.println("A is False");
		}

		// Comparison B
		if (word1.equals(word2)) {
			System.out.println("B is True");
		} else {
			System.out.println("B is False");
		}
	}

	public void treeSetExample() {
		TreeSet<String> myTree = new TreeSet<>();
		myTree.add("Apple Tree");
		myTree.add("Mango Tree");
		myTree.add("Guava Tree");
		System.out.format("%s%n", myTree);
		boolean check = myTree.contains("Peach Tree");
		if (check) {
			System.out.format("%s%n", check);
		} else {
			System.out.format("%s %s%n", "Tree NOT FOUND: ", check);
		}
		myTree.remove("Apple Tree");
		System.out.format("%s%n", myTree);
		myTree.add("Peach Tree");
		System.out.format("%s%n", myTree);
		myTree.clear();
		System.out.format("%s%n", myTree);
		int totalTrees = myTree.size();
		if (totalTrees > 0) {
			System.out.format("%s%n", "Plant More Trees.");
		} else {
			System.out.format("%s%n", "Start Trees PLANTATION.");
		}
		myTree.add("Apple Tree");
		myTree.add("Peach Tree");
		myTree.add("Mango Tree");
		for (String tree : myTree) {
			System.out.format("%s%n", tree);
		}
		totalTrees = myTree.size();
		if (totalTrees > 0) {
			System.out.format("%s%n", "Plant More Trees.");
		} else {
			System.out.format("%s%n", "Start Trees PLANTATION.");
		}

	}

	public void typeCastingJava() {
//		Widening Casting: Implicit Type Conversion in Java.
		System.out.println("Implicit Type Conversion In Java");
		byte b = 56;
		double d = b;
		System.out.println("Byte To Double: (" + b + " = " + d + ")");

//		Narrowing Casting: Explicit type Conversion in Java.
		System.out.println("Explicit Type Conversion In Java");
		b = ((byte) d);
		System.out.println("Double to Byte: (" + d + " = " + b + ").");
	}
}
