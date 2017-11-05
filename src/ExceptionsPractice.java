import java.util.ArrayList;

public class ExceptionsPractice {
	// 1. create a main method to test the other methods
public static void main(String[] args) {
	ArrayList<String> s = new ArrayList<String>();
	s.add("bird");
	s.add("plane");
	s.add("train");
	s.add("bear");
	ExceptionsPractice p = new ExceptionsPractice();
	try {
		p.stringChecker("Alec");
	} catch (SecurityException e) {
		e.printStackTrace();
	}
	
	try {
		p.math(1, 5, "subtract");
	} catch (UnsupportedOperationException e) {
		e.printStackTrace();
	}
	
	try {
		p.methodChecker(s, 1);
	} catch (IndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	
	try {
		p.rangeChecker(0, 3, s);
	} catch (IndexOutOfBoundsException e) {
		e.printStackTrace();
	} catch(NumberFormatException e){
		e.printStackTrace();
	}
	
}
	// 2. create a method that takes a string and checks if it matches a
	// password of your choice.
	// throw a SecurityException if the string does not match the password
public void stringChecker(String string) throws SecurityException{
	if (!string.equals("Alec")) {
		throw new SecurityException("Error in ExceptionsPractice in stringChecker");
	}
}
	// 3. create a method that takes in two ints and a String and returns an
	// int. The string will be
	// either "add" "multiply" or "subtract." Return the proper result with the
	// two ints.
	// throw an UnsupportedOperation exception if the string does not match a
	// proper operation
public int math(int first, int second,String s) throws UnsupportedOperationException{
	if (!s.equals("add")  && !s.equals("multiply") && !s.equals("subtract")) {
		throw new  UnsupportedOperationException("Error in math method");
	}
	else{
		if (s.equals("add")) {
			return first + second;
		}
		if (s.equals("multiply")) {
			return first * second;
		}
		return first - second;
	}
}
	// 4. create a mehtod that takes an ArrayList of strings and an int. The
	// method will then print
	// all the objects from the list starting from the int. Throw an
	// IndexOutOfBoundsException of
	// the list does not contain that element
public void methodChecker(ArrayList<String> ss, int num) throws IndexOutOfBoundsException{
if (num < 0 || num > ss.size()) {
	throw new IndexOutOfBoundsException("Error in mehtodchecker method");

}
else{
	for (int i = num; i < ss.size(); i++) {
		System.out.println(ss.get(i));
	}
}
}
	// 5. create a method that takes 2 ints and an ArrayList. This method will
	// print the range of elements
	// provided by the two ints. Throw an NumberFormatException if the numbers
	// are not in ascending order.
public void rangeChecker(int num1, int num2, ArrayList list)throws IndexOutOfBoundsException, NumberFormatException{
	if (num1 < 0 || num2 < 0 || num2 > list.size()){
		throw new IndexOutOfBoundsException("Error in rangechecker method");
	}
	if (num1 > num2) {
		throw new NumberFormatException("Error in rangechecker method");
	}
	else{
		for (int i = num1; i < num2; i++) {
			System.out.println(list.get(i));
		}
	}
}
	// 6. Create a class called Vector2D that has two member floats called x and
	// y.
	// Create a method called normalize that takes in a Vector2D and returns a
	// Vector2D.
	// The method should return the normal of the vector. Throw a
	// DivideByZeroException if the
	// x and y of the passed in vector are both 0.

}
