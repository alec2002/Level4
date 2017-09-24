import java.util.Random;


public class Mylist {
private int [] list;
int size;
public Mylist(){
	size = 0;
	
	list = new int[0];
}

public void add(int i){
     int[] newList = new int[size + 1];
	for (int j = 0; j < list.length; j++) {
		newList[j] = list[j];
	}
	newList[size] = i;
	list = newList;
	size += 1;
}

public int remove(int j){
	int[] newaddList = new int[size - 1];
	int val = list[j];
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

public int get(int e){
	if(e < 0 || e > size - 1){
		System.out.println("can't use that number");
	}

		return list[e];

	
}
public static void main(String[] args) {
	Mylist m = new Mylist();
	m.add(3);
	m.add(2);
	m.add(3);
	m.add(2);
	m.add(3);
	m.add(2);
	m.add(3);
	m.add(2);
	
for (int i = 0; i < 4; i++) {
	

	m.remove(0);
	m.print();
	System.out.println();
}
	//System.out.println(m.size);
	//
}

}
