import java.util.Random;


public class Mylist<T>{
private T [] list;
int size;
public Mylist(){
	size = 0;
	
	list = (T[])new Object[size];
}

public void add(T i){
     T[] newList = (T[])new Object[size + 1];
	for (int j = 0; j < list.length; j++) {
		newList[j] = list[j];
	}
	newList[size] = i;
	list = newList;
	size += 1;
}

public T remove(int j) throws Exception{
	if (j < 0 || j > list.length) {
		throw new Exception("To big or small");
	}
	T[] newaddList = (T[])new Object[size - 1];
	T val = list[j];
	for (int i = 0; i < j; i++) {
		newaddList[i] = list[i];
	}
	for (int i = j+1; i < newaddList.length+1; i++) {
		newaddList[i-1] = list[i];
	}
	
	list = newaddList;
	size -= 1;
	return val;
}
public void print(){
	for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
	}
}

public int size(){
	return size;
}

public T get(int e)throws Exception{
	if(e < 0 || e > size - 1){
		//System.out.println("can't use that number");
		throw new Exception("can't use that number");
	}

		return list[e];

	
}
public static void main(String[] args) {
	Mylist <String> m = new Mylist<String>();
	m.add("Hi");
	m.add("Boi");
	m.add("Dad");
	
	

	
	try {
		System.out.println(m.get(7));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(m.size());
	try {
		m.remove(7);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	m.print();
	
}
	
}


