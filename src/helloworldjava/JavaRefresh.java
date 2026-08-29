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
		short i, total, j;
		i = total = 0;

		//Logic Breakdown:
		//1 / 2 = 0.5
		//2 / 2 = 1
		//3 / 2 = 1.5
		//4 / 2 = 2
		//5 / 2 = 2.5
		//6 / 2 = 3
		//Even Calculation: (1+2+3) = (6)
		//Odd Calculation: (0.5+1.5+2.5) = (4.5)

		//Correct Logic Breakdown:
		//1 % 2 = 1
		//2 % 2 = 0
		//3 % 2 = 1
		//4 % 2 = 0
		//5 % 2 = 1
		//6 % 2 = 0
		//Even Calculation: (2+4) = (06)
		//Odd Calculation: (1+3+5) = (09)

		for (i = 1; i <= 5; i++) {
			if(i % 2 == 0) { total += i; }
			} System.out.format("%s %d%n", "Total: ", total);
	}
	public void JavaArray() {
		byte target, i;
		byte[] score = {85, 92, 78, 99, 64};
		target = 99;
		i =0;
		for(i = 0; i <= (score.length-1); i++) {
			if(score[i] == target) {
				System.out.println(target + " is at position: " + i);
				break;
//				continue;
			}
		}
	}
}
