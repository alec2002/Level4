package HospitalTest;
import java.util.ArrayList;


public class Hospital {
	int currentDoctor = 0;
	int ctr = 0;
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
public void assignPatientsToDoctors() throws DoctorFullException {
	for (Patient patient : patients) {
		doctors.get(currentDoctor).assignPatient(patient);
		
		if(ctr%3 == 2){
			currentDoctor++;
		}
		ctr ++;
	}
	
}
public void add(Doctor doctor) {
	doctors.add(doctor);
	
}
public void add(Patient patient) {
	patients.add(patient);
	
}
public void makeDoctorsWork() {
	for (Doctor doctor : doctors) {
		doctor.doMedicine();
	}
	
}
}
