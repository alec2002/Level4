import java.util.ArrayList;


public class Doctor {
ArrayList<Patient> patients = new ArrayList<Patient>();
public boolean performsSurgery(){
	return false;
}
public boolean makesHouseCalls(){
	return false;
}

public void assignPatient(Patient patient){
	if (patients.size() < 3) {
		patients.add(patient);
	}
}

public ArrayList<Patient> getPatients(){
	return patients;
}
}
