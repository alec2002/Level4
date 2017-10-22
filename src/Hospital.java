import java.util.ArrayList;


public class Hospital {
	ArrayList<Doctor> doctors;
	 ArrayList<Patient> patients;
Hospital(){
doctors = new ArrayList<Doctor>();
patients = new ArrayList<Patient>();
}
public void addDoctor(Doctor d){
	doctors.add(d);
	
}

public ArrayList<Doctor> getDoctors() {
	
	return doctors;
}

public void addPatient(Patient p){
	patients.add(p);
}
public ArrayList<Patient> getPatients(){
	return patients;
}
}
