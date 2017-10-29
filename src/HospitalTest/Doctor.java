package HospitalTest;
import java.util.ArrayList;


public class Doctor {
ArrayList<Patient> patients = new ArrayList<Patient>();
private boolean isEvil = false;
public Doctor(String string) {
	// TODO Auto-generated constructor stub
}

public Doctor(){
	
}
public boolean performsSurgery(){
	return false;
}
public boolean makesHouseCalls(){
	return false;
}

public void assignPatient(Patient patient) throws DoctorFullException{
	if (patients.size() >= 3) {
		throw new DoctorFullException();
	}
	else{
		patients.add(patient);
	}
}

public ArrayList<Patient> getPatients(){
	return patients;
}
public void doMedicine() {
	for (Patient patient : patients) {
		if (isEvil) {
			patient.kill();
		}
		patient.checkPulse();
	}
	
}
public Object isEvil() {
	return isEvil;
}
public void joinTheDarkSide() {
	isEvil = true;
	
}
}
