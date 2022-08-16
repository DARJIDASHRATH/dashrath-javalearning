package stringsmethods;

/**
 * All String
 * 
 * @author DASHRATH
 * @version 10.0
 * @since
 */

public class Strings {

	public static void main(String[] args) {
		System.out.println("ALL STRINGS");
		// Find length of string
		String name = "Dashrath";
		int length = name.length();
		System.out.println("String length: " + length);
		// Upper case of string
		String uppercase = name.toUpperCase();
		System.out.println("Uper case:" + uppercase);
		// lower case of string
		String lowercase = name.toLowerCase();
		System.out.println("Lower case:" + lowercase);
		// String charAt
		char ch = name.charAt(2);
		System.out.println("String CharAt:" + ch);
		// String compareTo
		String name1 = "Ram";
		System.out.println("String compareTo:" + name.compareTo(name1));
		// String concat
		String name2 = "love";
		String allname = name.concat(name1).concat(name2);
		System.out.println("String concat:" + allname);
		// String contains
		System.out.println("String contains:" + name.contains("sh"));
		// String endsWith
		System.out.println("String endsWith:" + name.endsWith("h"));
		// String equals
		System.out.println("String equals:" + name.equals(name1));
		// String equalsIgnoreCase
		System.out.println("String equalsIgnoreCase:" + name.equalsIgnoreCase(allname));
		// String format
		String number1 = String.format("My Name is %s", name);
		System.out.println("String format:" + number1);
		// String getBytes
		String n = "amee";
		byte[] ch1 = n.getBytes();
		System.out.println("String getBytes is " + ch1);
		// String getChars

		// String indexOf
		int number2 = name.indexOf("sh");
		System.out.println("String indexOf:" + number2);
		// String intern
		String s1 = new String("Dashrath");
		String s2 = "Dashrath";
		String s3 = s2.intern();
		System.out.println("String intern is:" + (s1 == s2));
		System.out.println("String intern is:" + (s2 == s3));
		// String isEmpty
		String n1 = "";
		String n2 = "name";
		System.out.println("String is Empty:" + (n1.isEmpty()));
		System.out.println("String is Empty:" + (n2.isEmpty()));
		// String join
		String q = String.join("-", "04", "08", "2022");
		System.out.println("String is join :" + q);
		// String lastIndexOf
		String q1 = "welcome to the world";
		int q2 = q1.lastIndexOf('e');
		System.out.println("String is lastIndexOf :" + q2);
		// String replace
		String a = "the sky color is blue";
		String a1 = a.replace("blue", "skyblue");
		System.out.println("String is replace: " + a1);
		// String replaceall
		String a2 = "the sky color is blue";
		String a3 = a2.replaceAll("e", "a");
		System.out.println("String is replace: " + a3);
		// String split
		String b = "the sky color is blue";
		String[] b1 = b.split(" ");
		for (String b2 : b1) {
			System.out.println("String is Split: " + b2);
		}
		// String startsWith
		String c = "lerningjava";
		boolean c1 = c.startsWith("r");
		System.out.println("String is startsWith :" + c1);
		// String substring
		String d = "lerning";
		System.out.println("String is substring :" + d.substring(2, 5));
		// String toCharArray
		String d1 = "August";
		char[] d2 = d1.toCharArray();
		int d3 = d2.length;
		for (int i = 5; i < d3; i++) {
			System.out.println("String is toCharArray :" + d3);
			// String trim
			String e = "hello java world";
			System.out.println("String is trim :" + e.trim() + " hello");
			// String valueOf
			int g = 15;
			boolean g1 = true;
			String f = String.valueOf(g);
			String f2 = String.valueOf(g1);
			System.out.println("String is valueOf :" + f);
			System.out.println("String is valueOf :" + f2);
		}
	}
}
