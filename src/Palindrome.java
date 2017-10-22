
public class Palindrome {
	
public boolean isPalindrome(String string) {
	String x = reverseString(string);
	x = removeSpaces(x);
	String y = removeSpaces(string);
	if (x.equalsIgnoreCase(y)) {
		return true;
	}
	return false;
		
	}
String reverseString(String s){
	String newString = "";
	for (int i = s.length()-1; i >= 0; i--) {
		newString += s.charAt(i);
	}
	//System.out.println(newString);
	return newString;
	
}
String removeSpaces(String s){
	String withoughtSpaces = "";
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '!') {
			withoughtSpaces += s.charAt(i);
		}
	}
	System.out.println(withoughtSpaces);
	return withoughtSpaces;
}

}
