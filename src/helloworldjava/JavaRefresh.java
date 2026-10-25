package helloworldjava;

import java.util.Date;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashMap;
public class JavaRefresh extends Maths {
	public void checkDrivingStatus() {
		short yourAge, license;
		yourAge = license = 0;
		var statement = Messages.getString("JavaRefresh.0"); //$NON-NLS-1$
		final var s = new Scanner(System.in);
		System.out.println(statement);
		yourAge = Short.parseShort(s.nextLine());
		if (yourAge >= 18) {
			statement = Messages.getString("JavaRefresh.1"); //$NON-NLS-1$
			System.out.println(statement);
			license = Short.parseShort(s.nextLine());
			if (license > 0) {
				statement = Messages.getString("JavaRefresh.2"); //$NON-NLS-1$
			} else {
				statement = Messages.getString("JavaRefresh.3"); //$NON-NLS-1$
			}
		} else {
			statement = Messages.getString("JavaRefresh.4"); //$NON-NLS-1$
		}
		s.close();
		System.out.println(statement);
	}

	public void dataTypesJava() {

//		Java Primitive Variables:

		System.out.println(Messages.getString("JavaRefresh.5")); //$NON-NLS-1$

		byte b = 28;
		final short s = 28;
		final var l = 28L;
		final var i = 28;
		final var f = 28.00f;
		final var d = 28D;
		final var c = 'P';
		final var bool = true;

		System.out.println(Messages.getString("JavaRefresh.6") + b + Messages.getString("JavaRefresh.7")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.8") + s + Messages.getString("JavaRefresh.9")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.10") + l + Messages.getString("JavaRefresh.11")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.12") + i + Messages.getString("JavaRefresh.13")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.14") + f + Messages.getString("JavaRefresh.15")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.16") + d + Messages.getString("JavaRefresh.17")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.18") + c + Messages.getString("JavaRefresh.19")); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("JavaRefresh.20") + bool + Messages.getString("JavaRefresh.21")); //$NON-NLS-1$ //$NON-NLS-2$

		System.out.println(Messages.getString("JavaRefresh.22")); //$NON-NLS-1$

		final var str = Messages.getString("JavaRefresh.23"); //$NON-NLS-1$
		final byte counting[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(Messages.getString("JavaRefresh.24") + str); //$NON-NLS-1$
		System.out.println(Messages.getString("JavaRefresh.25")); //$NON-NLS-1$
		for (b = 0; b < counting.length; b++) {
			System.out.format(Messages.getString("JavaRefresh.26"), counting[b]); //$NON-NLS-1$
		}
	}

	public void hashSetExample() {
		final var myCars = new HashSet<String>();
		myCars.add(Messages.getString("JavaRefresh.27")); //$NON-NLS-1$
		myCars.add(Messages.getString("JavaRefresh.28")); //$NON-NLS-1$
		myCars.add(Messages.getString("JavaRefresh.29")); //$NON-NLS-1$
		myCars.add(Messages.getString("JavaRefresh.30")); //$NON-NLS-1$
		myCars.add(Messages.getString("JavaRefresh.31")); //$NON-NLS-1$
		myCars.add(Messages.getString("JavaRefresh.32")); //$NON-NLS-1$
		System.out.format(Messages.getString("JavaRefresh.33"), myCars.size()); //$NON-NLS-1$
		System.out.format(Messages.getString("JavaRefresh.34"), myCars); //$NON-NLS-1$
		final var check = myCars.contains(Messages.getString("JavaRefresh.35")); //$NON-NLS-1$
		System.out.println(check);
		myCars.remove(Messages.getString("JavaRefresh.36")); //$NON-NLS-1$
		System.out.println(myCars);
		System.out.format(Messages.getString("JavaRefresh.37"), myCars.size()); //$NON-NLS-1$
		System.out.format(Messages.getString("JavaRefresh.38"), Float.parseFloat(String.valueOf(myCars.size()))); //$NON-NLS-1$
		for (final String s : myCars) {
			System.out.format(Messages.getString("JavaRefresh.39"), s); //$NON-NLS-1$
		}
		myCars.clear();
		System.out.format(Messages.getString("JavaRefresh.40"), myCars); //$NON-NLS-1$
	}

	public void JavaArray() {
		byte target, i;
		final byte[] score = { 85, 92, 78, 99, 64 };
		target = 99;
		i = 0;
		for (i = 0; i <= score.length - 1; i++) {
			if (score[i] == target) {
				System.out.println(target + Messages.getString("JavaRefresh.41") + i); //$NON-NLS-1$
				continue;
			}
		}
		final var myCountry = new char[8];
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
		final var dT = new Date();
		final var cal = new GregorianCalendar();
		System.out.println(Messages.getString("JavaRefresh.42") + dT.toString()); //$NON-NLS-1$
		System.out.println(Messages.getString("JavaRefresh.43") + cal.getTimeZone().getID().toString()); //$NON-NLS-1$
	}

	public void JavaException() throws ArrayIndexOutOfBoundsException {
		System.out.println(Messages.getString("JavaRefresh.44")); //$NON-NLS-1$
		try {
			final var counting = new byte[10];
			System.out.format(Messages.getString("JavaRefresh.45"), counting); //$NON-NLS-1$
			throw new ArrayIndexOutOfBoundsException(Messages.getString("JavaRefresh.46")); //$NON-NLS-1$
		} catch (final Exception e) {
			System.out.println(Messages.getString("JavaRefresh.47") + e.toString()); //$NON-NLS-1$
		}
	}

	public void JavaLoops() {
		final var fun = new Functions();
		byte counter = 0;
		final byte counting[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		final var leng = Byte.parseByte(String.valueOf(counting.length));

//		For Loop Example
		fun.display(Messages.getString("JavaRefresh.48")); //$NON-NLS-1$
		for (counter = 0; counter < leng; counter++) {
			fun.display(counting[counter]);
		}

//		while loop example
		fun.display(Messages.getString("JavaRefresh.49")); //$NON-NLS-1$
		counter = Byte.parseByte(String.valueOf(leng - 1));
		while (counter >= 0) {
			fun.display(counting[counter]);
			counter--;
		}

//		DO-While Loop Example
		fun.display(Messages.getString("JavaRefresh.50")); //$NON-NLS-1$
		counter = 0;
		do {
			fun.display(counting[counter]);
			counter++;
		} while (counter <= leng - 1);

//	For-in Loop Example
		fun.display(Messages.getString("JavaRefresh.51")); //$NON-NLS-1$
		for (final Byte b : counting) {
			fun.display(b);
		}
	}

	public void javaOperators() {
//		Ternary Operator
		short age = 16, check;
		check = age < 18 ? age++ : age--;
		System.out.println(check + Messages.getString("JavaRefresh.52") + age); //$NON-NLS-1$
//		instance of Operator
		System.out.format(Messages.getString("JavaRefresh.53"), Messages.getString("JavaRefresh.54") instanceof String); //$NON-NLS-1$ //$NON-NLS-2$

	}

	public void JavaString() throws MyException {

		final var myCountry = Messages.getString("JavaRefresh.55"); //$NON-NLS-1$
		final var country = Messages.getString("JavaRefresh.56"); //$NON-NLS-1$
		final var myCity = Messages.getString("JavaRefresh.57"); //$NON-NLS-1$
		final var city = Messages.getString("JavaRefresh.58"); //$NON-NLS-1$

		System.out.println(myCountry.toLowerCase() == country.toLowerCase()); // returns (false) because (Primitive
																				// DataType).
		System.out.println(country.toLowerCase().equals(myCountry.toLowerCase())); // returns (true) because (Object
																					// Comparison).

		System.out.println(myCity.toLowerCase() == city.toLowerCase()); // returns (false) because two Objects cannot
																		// have same address.
		System.out.println(myCity.toLowerCase().equals(city.toLowerCase())); // returns (true) because Two Different
																				// Objects have Same Text.
		throw new MyException(myCity + Messages.getString("JavaRefresh.59") + myCountry); //$NON-NLS-1$
	}

	public void javaSwitch() {
		final String[] drinks = { Messages.getString("JavaRefresh.60"), Messages.getString("JavaRefresh.61"), Messages.getString("JavaRefresh.62") }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		final var fun = new Functions();
		fun.display(Messages.getString("JavaRefresh.63")); //$NON-NLS-1$
		fun.display(Messages.getString("JavaRefresh.64")); //$NON-NLS-1$
		final byte option = 0;
		var statement = Messages.getString("JavaRefresh.65"); //$NON-NLS-1$
		switch (option) {
		case 1: {
			statement = Messages.getString("JavaRefresh.66") + drinks[option]; //$NON-NLS-1$
			break;
		}
		case 2: {
			statement = Messages.getString("JavaRefresh.67") + drinks[option]; //$NON-NLS-1$
		}
		case 3: {
			statement = Messages.getString("JavaRefresh.68") + drinks[option]; //$NON-NLS-1$
		}
		default:
			throw new IllegalArgumentException(Messages.getString("JavaRefresh.69") + option); //$NON-NLS-1$
		}
		fun.display(statement);
	}

	public void linkedHashSetExample() {
		final var mySet = new LinkedHashSet<Integer>();
		final int counting[] = new int[10];
		for (var i = 0; i <= counting.length - 1; i++) {
			counting[i] = i;
			for (var j = 0; j <= i; j++) {
				mySet.add(counting[j]);
			}
		}
		System.out.format(Messages.getString("JavaRefresh.70"), mySet); //$NON-NLS-1$
		mySet.remove(counting[0]);
		System.out.format(Messages.getString("JavaRefresh.71"), mySet); //$NON-NLS-1$
		final var check = mySet.contains(counting[6]);
		System.out.format(Messages.getString("JavaRefresh.72"), check, counting[6]); //$NON-NLS-1$
		for (final Integer k : mySet) {
			System.out.format(Messages.getString("JavaRefresh.73"), k); //$NON-NLS-1$
		}
		final var getSize = mySet.size();
		System.out.format(Messages.getString("JavaRefresh.74"), Messages.getString("JavaRefresh.75"), getSize); //$NON-NLS-1$ //$NON-NLS-2$
		mySet.clear();
		System.out.format(Messages.getString("JavaRefresh.76"), mySet); //$NON-NLS-1$
	}

	public void nonPrimitiveTypes() {
		// Non Primitives DataTypes are programmer defined, except String and Array
		// DataTypes.
		final var textStatement = Messages.getString("JavaRefresh.77"); //$NON-NLS-1$
		final short counting[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		final char myCountry[] = { 'P', 'A', 'K', 'I', 'S', 'T', 'A', 'N' };
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
			System.out.println(i + Messages.getString("JavaRefresh.78") + textStatement); //$NON-NLS-1$
			i++;
		} while (i < textStatement.length());
	}

	public void primitiveTypes() {
//		There are Eight (08) Premitive Dataypes in Java.
		final byte age = 127; // (08) Bits called 1 Byte
		System.out.println(Messages.getString("JavaRefresh.79") + age + Messages.getString("JavaRefresh.80")); //$NON-NLS-1$ //$NON-NLS-2$
		final short score = 32767; // (02) Bytes: 16 Bits
		System.out.println(Messages.getString("JavaRefresh.81") + score + Messages.getString("JavaRefresh.82")); //$NON-NLS-1$ //$NON-NLS-2$
		final var salary = 2100000000; // (04) Bytes: 32 Bits.
		System.out.println(Messages.getString("JavaRefresh.83") + salary + Messages.getString("JavaRefresh.84")); //$NON-NLS-1$ //$NON-NLS-2$
		final var distance = 2100000000L; // (08) Bytes: 64 Bits.
		System.out.println(Messages.getString("JavaRefresh.85") + distance + Messages.getString("JavaRefresh.86")); //$NON-NLS-1$ //$NON-NLS-2$
		final var PI = 3.14f; // (04) Bytes: 32 Bits. SIngle Precision Fractional.
		System.out.println(Messages.getString("JavaRefresh.87") + PI + Messages.getString("JavaRefresh.88")); //$NON-NLS-1$ //$NON-NLS-2$
		final var price = 44.33; // (08) Bytes: 64 Bits. Double Precision Fractional.
		System.out.println(Messages.getString("JavaRefresh.89") + price + Messages.getString("JavaRefresh.90")); //$NON-NLS-1$ //$NON-NLS-2$
		final var weekend = true; // (01) Bit. Only (True or False).
		System.out.println(Messages.getString("JavaRefresh.91") + weekend + Messages.getString("JavaRefresh.92")); //$NON-NLS-1$ //$NON-NLS-2$
		final var letter = 'P'; // (02) Bytes: 16 Bits, Unicode Characters, SIngle Quoted.
		System.out.println(Messages.getString("JavaRefresh.93") + letter + Messages.getString("JavaRefresh.94")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public void stringExample() {

		final var word1 = Messages.getString("JavaRefresh.95"); //$NON-NLS-1$
		final var word2 = Messages.getString("JavaRefresh.96"); //$NON-NLS-1$

		// Comparison A
		if (word1 == word2) {
			System.out.println(Messages.getString("JavaRefresh.97")); //$NON-NLS-1$
		} else {
			System.out.println(Messages.getString("JavaRefresh.98")); //$NON-NLS-1$
		}

		// Comparison B
		if (word1.equals(word2)) {
			System.out.println(Messages.getString("JavaRefresh.99")); //$NON-NLS-1$
		} else {
			System.out.println(Messages.getString("JavaRefresh.100")); //$NON-NLS-1$
		}
	}

	public void treeSetExample() {
		final var myTree = new TreeSet<String>();
		myTree.add(Messages.getString("JavaRefresh.101")); //$NON-NLS-1$
		myTree.add(Messages.getString("JavaRefresh.102")); //$NON-NLS-1$
		myTree.add(Messages.getString("JavaRefresh.103")); //$NON-NLS-1$
		System.out.format(Messages.getString("JavaRefresh.104"), myTree); //$NON-NLS-1$
		final var check = myTree.contains(Messages.getString("JavaRefresh.105")); //$NON-NLS-1$
		if (check) {
			System.out.format(Messages.getString("JavaRefresh.106"), check); //$NON-NLS-1$
		} else {
			System.out.format(Messages.getString("JavaRefresh.107"), Messages.getString("JavaRefresh.108"), check); //$NON-NLS-1$ //$NON-NLS-2$
		}
		myTree.remove(Messages.getString("JavaRefresh.109")); //$NON-NLS-1$
		System.out.format(Messages.getString("JavaRefresh.110"), myTree); //$NON-NLS-1$
		myTree.add(Messages.getString("JavaRefresh.111")); //$NON-NLS-1$
		System.out.format(Messages.getString("JavaRefresh.112"), myTree); //$NON-NLS-1$
		myTree.clear();
		System.out.format(Messages.getString("JavaRefresh.113"), myTree); //$NON-NLS-1$
		var totalTrees = myTree.size();
		if (totalTrees > 0) {
			System.out.format(Messages.getString("JavaRefresh.114"), Messages.getString("JavaRefresh.115")); //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			System.out.format(Messages.getString("JavaRefresh.116"), Messages.getString("JavaRefresh.117")); //$NON-NLS-1$ //$NON-NLS-2$
		}
		myTree.add(Messages.getString("JavaRefresh.118")); //$NON-NLS-1$
		myTree.add(Messages.getString("JavaRefresh.119")); //$NON-NLS-1$
		myTree.add(Messages.getString("JavaRefresh.120")); //$NON-NLS-1$
		for (final String tree : myTree) {
			System.out.format(Messages.getString("JavaRefresh.121"), tree); //$NON-NLS-1$
		}
		totalTrees = myTree.size();
		if (totalTrees > 0) {
			System.out.format(Messages.getString("JavaRefresh.122"), Messages.getString("JavaRefresh.123")); //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			System.out.format(Messages.getString("JavaRefresh.124"), Messages.getString("JavaRefresh.125")); //$NON-NLS-1$ //$NON-NLS-2$
		}

	}

	public void typeCastingJava() {
//		Widening Casting: Implicit Type Conversion in Java.
		System.out.println(Messages.getString("JavaRefresh.126")); //$NON-NLS-1$
		byte b = 56;
		final double d = b;
		System.out.println(Messages.getString("JavaRefresh.127") + b + Messages.getString("JavaRefresh.128") + d + Messages.getString("JavaRefresh.129")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

//		Narrowing Casting: Explicit type Conversion in Java.
		System.out.println(Messages.getString("JavaRefresh.130")); //$NON-NLS-1$
		b = (byte) d;
		System.out.println(Messages.getString("JavaRefresh.131") + d + Messages.getString("JavaRefresh.132") + b + Messages.getString("JavaRefresh.133")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	public void hashMapExample() {
		HashMap<String,String> cityCodes = new HashMap<String, String>();
		int getSize = 0;
		cityCodes.put("KHI","karachi City");
		cityCodes.put("LHE","Lahore City");
		cityCodes.put("ISB","Islamabad City");
		getSize = cityCodes.size();
		System.out.format("%s %d %n",cityCodes, getSize);
		String myCity = cityCodes.get("KHI");
		System.out.format("%s%n", myCity.toUpperCase());
		cityCodes.remove("LHE");
		getSize = cityCodes.size();
		System.out.format("%s %d %n",cityCodes, getSize);
		cityCodes.clear();
		getSize = cityCodes.size();
		System.out.format("%s %d %n",cityCodes, getSize);
		cityCodes.put("KHI".toLowerCase(),"karachi City".toLowerCase());
		cityCodes.put("LHE".toLowerCase(),"Lahore City".toLowerCase());
		cityCodes.put("ISB".toLowerCase(),"Islamabad City".toLowerCase());
		for(String city: cityCodes.keySet()) {
			System.out.format("%s: %s%n",city.toUpperCase(), cityCodes.get(city).toUpperCase());
		}
	}
	public void treeMapExample() {
		HashMap<String, Byte> grades = new HashMap<String, Byte>(); 
		grades.put("A-Grade", (byte)90);
		grades.put("B-Grade", (byte)80);
		grades.put("C-Grade", (byte)70);
		System.out.println(grades);
		byte getSize = (byte) grades.size();
		System.out.println("Total GRADES: " + getSize);
		byte getPercentage = grades.get("B-Grade");
		System.out.println("%tage: " + getPercentage);
		grades.remove("C-Grade");
		System.out.println(grades);
		grades.put("D-Grade", (byte)60);
		grades.put("C-Grade", (byte)70);
		getSize = (byte)grades.size();
		System.out.println("Total GRADES: " + getSize);
		for(String grade: grades.keySet()) {
			System.out.println(grades.get(grade) + " = " + grade);
		}
		grades.clear();
		System.out.println(grades);
		getSize = (byte)grades.size();
		System.out.println("Total GRADES: " + getSize);
	}
}
