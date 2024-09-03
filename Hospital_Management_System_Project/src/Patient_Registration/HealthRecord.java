package Patient_Registration;

public class HealthRecord 
{
	  private String recordId;
	    private String patientId;
	    private String diagnosis;
	    private String treatment;

	    public HealthRecord(String recordId, String patientId, String diagnosis, String treatment) {
	        this.recordId = recordId;
	        this.patientId = patientId;
	        this.diagnosis = diagnosis;
	        this.treatment = treatment;
	    }


	    public String getRecordId() { return recordId; }
	    public void setRecordId(String recordId) { this.recordId = recordId; }
	    
	    public String getPatientId() { return patientId; }
	    public void setPatientId(String patientId) { this.patientId = patientId; }
	    
	    public String getDiagnosis() { return diagnosis; }
	    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
	    
	    public String getTreatment() { return treatment; }
	    public void setTreatment(String treatment) { this.treatment = treatment; }

	    @Override
	    public String toString() 
	    {
	        return "HealthRecord [ID=" + recordId + ", PatientID=" + patientId + ", Diagnosis=" + diagnosis + ", Treatment=" + treatment + "]";
	    }
}
