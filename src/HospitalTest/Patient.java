package HospitalTest;
import java.util.ArrayList;


public class Patient {
	boolean happy = false;
	private boolean isAlive = true;
ArrayList<Patient> p = new ArrayList<Patient>();

public boolean feelsCaredFor(){
	return happy;
}

public void checkPulse() {
	happy = true;
	
}

public Object isAlive() {
return isAlive;
}
public void kill(){
	isAlive = false;
}

}
