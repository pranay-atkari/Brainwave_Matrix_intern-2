package Patient_Registration;

import java.util.HashMap;
import java.util.Map;

public class PatientManager 
{
	 private Map<String, Patient> patientDatabase = new HashMap<>();
	    
	    public void registerPatient(Patient patient) {
	        patientDatabase.put(patient.getPatientId(), patient);
	    }
	    
	    public Patient getPatient(String patientId) {
	        return patientDatabase.get(patientId);
	    }
	    
	    public void updatePatient(Patient patient) {
	        patientDatabase.put(patient.getPatientId(), patient);
	    }
}
