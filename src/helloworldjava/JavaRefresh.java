package helloworldjava;

public class JavaRefresh {
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
	public void JavaLoops() {
		
	}
}
