package helloworldjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

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

	public void doLoopExample() {

		int count[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int len = count.length;
		int loop = 0;
		do {
			System.out.println(count[loop]);
			loop++;
		} while (loop < len);
	}

	public void JavaArray() {
		byte target, i;
		byte[] score = { 85, 92, 78, 99, 64 };
		target = 99;
		i = 0;
		for (i = 0; i <= (score.length - 1); i++) {
			if (score[i] == target) {
				System.out.println(target + " is at position: " + i);
				break;
//				continue;
			}
		}
	}

	public void javaDatesAndTime() {
//		Java Dates and Time Library.
		Date dT = new Date();
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println("Today's Date: " + dT.toString());
		System.out.println("Java Calander: " + cal.getTimeZone().getID().toString());
	}

	public void JavaLoops() {
		short i, total;
		i = total = 0;

		// Logic Breakdown:
		// 1 / 2 = 0.5
		// 2 / 2 = 1
		// 3 / 2 = 1.5
		// 4 / 2 = 2
		// 5 / 2 = 2.5
		// 6 / 2 = 3
		// Even Calculation: (1+2+3) = (6)
		// Odd Calculation: (0.5+1.5+2.5) = (4.5)

		// Correct Logic Breakdown:
		// 1 % 2 = 1
		// 2 % 2 = 0
		// 3 % 2 = 1
		// 4 % 2 = 0
		// 5 % 2 = 1
		// 6 % 2 = 0
		// Even Calculation: (2+4) = (06)
		// Odd Calculation: (1+3+5) = (09)

		for (i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.format("%s %d%n", "Total: ", total);
	}

	public void javaOperators() {
//		Ternary Operator
//		short age = 16, check;
//		check = (age < 18) ? age++ : age--;
//		System.out.println(check + ", " + age);

//		instance of Operator
		System.out.format("%s", ("Wellcome" instanceof String));

	}

	public void JavaString() {

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
//			i = 0;
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
