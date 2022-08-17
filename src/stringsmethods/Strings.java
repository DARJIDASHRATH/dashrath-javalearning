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
		char charecter = name.charAt(2);
		System.out.println("String CharAt:" + charecter);
		// String compareTo
		String nameOne = "Ram";
		System.out.println("String compareTo:" + name.compareTo(nameOne));
		// String concat
		String nameTwo = "love";
		String allName = name.concat(nameOne).concat(nameTwo);
		System.out.println("String concat:" + allName);
		// String contains
		System.out.println("String contains:" + name.contains("sh"));
		// String endsWith
		System.out.println("String endsWith:" + name.endsWith("h"));
		// String equals
		System.out.println("String equals:" + name.equals(nameOne));
		// String equalsIgnoreCase
		System.out.println("String equalsIgnoreCase:" + name.equalsIgnoreCase(allName));
		// String format
		String stringFormat = String.format("My Name is %s", name);
		System.out.println("String format:" + stringFormat);
		// String getBytes
		String girlName = "Amee";
		byte[] ch1 = girlName.getBytes();
		System.out.println("String getBytes is " + ch1);
		// String getChars

		// String indexOf
		int indexNumber = name.indexOf("sh");
		System.out.println("String indexOf:" + indexNumber);
		// String intern
		String customerName = new String("Dashrath");
		String customerNameOne = "Dashrath";
		String customerNameTwo = customerNameOne.intern();
		System.out.println("String intern is:" + (customerName == customerNameOne));
		System.out.println("String intern is:" + (customerNameOne == customerNameTwo));
		// String isEmpty
		String empty = "";
		String filed = "Name";
		System.out.println("String is Empty:" + (empty.isEmpty()));
		System.out.println("String is Empty:" + (filed.isEmpty()));
		// String join
		String date = String.join("-", "04", "08", "2022");
		System.out.println("String is join :" + date);
		// String lastIndexOf
		String lastIndex = "Welcome to the world";
		int printIndex = lastIndex.lastIndexOf('e');
		System.out.println("String is lastIndexOf :" + printIndex);
		// String replace
		String skyColor = "the sky color is blue";
		String changedColor = skyColor.replace("blue", "skyblue");
		System.out.println("String is replace: " + changedColor);
		// String replaceall
		String replaceAlphabet = "the sky color is blue";
		String changedAlphabet = replaceAlphabet.replaceAll("e", "a");
		System.out.println("String is replace: " + changedAlphabet);
		// String split
		String splitSentance = "The sky color is blue";
		String[] splitAfter = splitSentance.split(" ");
		for (String splitFrom : splitAfter) {
			System.out.println("String is Split: " + splitFrom);
		}
		// String startsWith
		String startWith = "Lerningjava";
		boolean startWithAlphabet = startWith.startsWith("r");
		System.out.println("String is startsWith :" + startWithAlphabet);
		// String substring
		String findMiddleInName = "Lerning";
		System.out.println("String is substring :" + findMiddleInName.substring(2, 5));
		// String toCharArray
		String currentMonth = "August";
		char[] monthArray = currentMonth.toCharArray();
		int monthLength = monthArray.length;
		System.out.println("String is tochararray :" + monthLength);
		// String trim
		String trimLine = "Hello java world";
		System.out.println("String is trim :" + trimLine.trim() + " Hello");
		// String valueOf
		int intValue = 15;
		boolean booleanValue = true;
		String stringIntValue = String.valueOf(intValue);
		String stringBooleanValue = String.valueOf(booleanValue);
		System.out.println("String is valueOf :" + stringIntValue);
		System.out.println("String is valueOf :" + stringBooleanValue);
	}

}